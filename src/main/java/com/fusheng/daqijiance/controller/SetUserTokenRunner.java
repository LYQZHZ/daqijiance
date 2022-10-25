package com.fusheng.daqijiance.controller;

import com.alibaba.fastjson.JSONObject;
import com.fusheng.daqijiance.mapper.DQJCMapper;
import com.fusheng.daqijiance.model.UserToken;
import com.fusheng.daqijiance.utils.HttpPostUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 实现MyCommandLineRunner接口,执行顺序按照value值决定,值小先执行
 *
 * @author 李岩青
 * @version 0.0.1
 * @date 2022年7月28日
 */
@Slf4j
@Component
@Order(value = 1)
public class SetUserTokenRunner implements CommandLineRunner {
    /*当需要时自动装入该类*/
    @Resource
    private DQJCMapper dqjcMapper;

    @Override
    public void run(String... args) throws Exception {
        log.info("执行SetUserTokenRunner");
        // 同步缓存中的通知消息数目
        final long timeInterval = 3600000;
        UserToken userToken = new UserToken();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    // ------- code for task to run
                    String UserData = null;
                    /*定义json格式字符串用于获取用户token*/
                    String json = "{\"appKey\": \"Z5pRF260\",\"appSecret\": \"kpjaxnivkq1g0oj9d7bie4z78lt6uyo5\"}";
                    UserData = HttpPostUtils.doPostJson("https://openapi.mp.usr.cn/usrCloud/user/getAuthToken", json);
//                    System.out.println(UserData);
                    /*
                     * 将字符串转换为json格式
                     * */
                    JSONObject jo = JSONObject.parseObject(new String(UserData));
//                    System.out.println(jo);
                    /*提取json数据中的X-Access-Token值*/
                    String Token = (jo.getJSONObject("data")).getString("X-Access-Token");
//                    System.out.println(Token);
                    /*String salt = md5Util.getRandomSalt();
                    String TokenNew = md5Util.getHMAC(Token, salt);*/
                    userToken.setToken(Token);
                    dqjcMapper.deleteAllUserToken();
                    dqjcMapper.insertToken(userToken);
                    // ------- ends here
                    try {
                        Thread.sleep(timeInterval);
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