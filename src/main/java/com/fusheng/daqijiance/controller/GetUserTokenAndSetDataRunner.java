package com.fusheng.daqijiance.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fusheng.daqijiance.mapper.DQJCMapper;
import com.fusheng.daqijiance.model.DaQiShuJu;
import com.fusheng.daqijiance.model.UserToken;
import com.fusheng.daqijiance.utils.HttpPostUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.Thread.sleep;

/**
 * 实现MyCommandLineRunner接口,执行顺序按照value值决定,值小先执行
 * <p>
 * 通过获取数据库中的token值来获取云端的数据并放入数据库中
 *
 * @author 李岩青
 * @version 0.0.1
 * @date 2022年7月29日
 */
@Slf4j
@Component
@Order(value = 2)
public class GetUserTokenAndSetDataRunner implements CommandLineRunner {
    /*当需要时自动装入该类*/
    @Resource
    private DQJCMapper dqjcMapper;

    @Override
    public void run(String... args) throws Exception {
        sleep(3000);
        log.info("执行GetUserTokenAndSetDataRunner");
        // 同步缓存中的通知消息数目
        final long timeInterval = 60000;
        DaQiShuJu daQiShuJu = new DaQiShuJu();

        SimpleDateFormat sdf = new SimpleDateFormat();// 格式化时间
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss");// a为am/pm的标记

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    // ------- code for task to run
                    String json2 = "{\n" +
                            "    \"devDatapoints\": [\n" +
                            "        {\n" +
                            "            \"deviceNo\": \"01201720101200011539\",\n" +
                            "            \"slaveIndex\": \"1\",\n" +
                            "            \"dataPointId\": 8504680\n" +
                            "        },\n" +
                            "        {\n" +
                            "            \"deviceNo\": \"01201720101200011539\",\n" +
                            "            \"slaveIndex\": \"1\",\n" +
                            "            \"dataPointId\": 8648025\n" +
                            "        },\n" +
                            "        {\n" +
                            "            \"deviceNo\": \"01201720101200011539\",\n" +
                            "            \"slaveIndex\": \"1\",\n" +
                            "            \"dataPointId\": 8648026\n" +
                            "        },\n" +
                            "        {\n" +
                            "            \"deviceNo\": \"01201720101200011539\",\n" +
                            "            \"slaveIndex\": \"1\",\n" +
                            "            \"dataPointId\": 11787557\n" +
                            "        },\n" +
                            "        {\n" +
                            "            \"deviceNo\": \"01201720101200011539\",\n" +
                            "            \"slaveIndex\": \"1\",\n" +
                            "            \"dataPointId\": 11787558\n" +
                            "        }\n" +
                            "    ]\n" +
                            "}";
                    UserToken TOKEN = null;
                    int time = 0;
                    while (TOKEN == null && time < 10) {
                        TOKEN = dqjcMapper.getUserToken();
//                        如果获取不道值就等待1秒再次获取否则就退出循环
                        if (TOKEN == null) {
                            try {
                                time += 1;
                                sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    if (TOKEN == null && time == 10) {
                        log.debug("服务器已超过10秒未能正常获取用户token，请检查服务器是否故障");
                    } else {
                        String TrsdData = HttpPostUtils.postParams("https://openapi.mp.usr.cn/usrCloud/vn/ucloudSdk/getLastDataHistory", json2, TOKEN.getToken());
                        //将返回的数据转换为json格式
                        JSONObject TrsdDatajo = JSONObject.parseObject(new String(TrsdData));
                        //获取数据中的某个设备的全部数据
                        JSONArray dataList1 = (TrsdDatajo.getJSONObject("data")).getJSONArray("list");
                        //获取设备的某一个键的值，此处设备id
                        for (int i = 0; i < dataList1.size(); i++) {
                            String dataPointId = dataList1.getJSONObject(i).getString("dataPointId");
                            String deviceNo = dataList1.getJSONObject(i).getString("deviceNo");
                            String value = dataList1.getJSONObject(i).getString("value");
                            Date nowDate = new Date();// 获取当前时间
                            daQiShuJu.setDataPointId(dataPointId);
                            daQiShuJu.setDeviceNo(deviceNo);
                            daQiShuJu.setValue(Double.valueOf(value));
                            daQiShuJu.setDate(sdf.format(nowDate));


                            if (i == 0) {

                                dqjcMapper.insertNh3(daQiShuJu);
                            } else if (i == 1) {

                                dqjcMapper.insertNo2(daQiShuJu);
                            } else if (i == 2) {

                                dqjcMapper.insertCo(daQiShuJu);
                            } else if (i == 3) {

                                dqjcMapper.insertCo2(daQiShuJu);
                            } else if (i == 4) {

                                dqjcMapper.insertTvoc(daQiShuJu);
                            }

                            System.out.println(dataPointId);
                            System.out.println(deviceNo);
                            System.out.println(value);
                            System.out.println(sdf.format(nowDate));
                        }

                    }
                    // ------- ends here
                    try {
                        sleep(timeInterval);
                    } catch
                    (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}