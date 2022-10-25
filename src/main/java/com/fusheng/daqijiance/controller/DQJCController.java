package com.fusheng.daqijiance.controller;


import com.fusheng.daqijiance.mapper.DQJCMapper;
import com.fusheng.daqijiance.model.User;
import com.fusheng.daqijiance.utils.CheckEmail;
import com.fusheng.daqijiance.utils.CheckPassword;
import com.fusheng.daqijiance.utils.md5Util;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Description:控制层
 * @return:
 * @Author: 李岩青
 * @Date: 2022年8月1日
 */
@org.springframework.stereotype.Controller
@RequestMapping(value = "/dqjc")
public class DQJCController {
    @Resource
    private DQJCMapper dqjcMapper;

    /*@RequestMapping("/data")
    public String getData(ExtendedModelMap model, HttpSession httpSession) {

        *//*String UserData = null;
     *//**//*定义json格式字符串用于获取用户token*//**//*
        String json = "{\"appKey\": \"Z5pRF260\",\"appSecret\": \"kpjaxnivkq1g0oj9d7bie4z78lt6uyo5\"}";
        UserData = HttpPostUtils.doPostJson("https://openapi.mp.usr.cn/usrCloud/user/getAuthToken", json);
        httpSession.setAttribute("userToken", UserData);
        System.out.println(UserData);
        *//**//*
     * 将字符串转换为json格式
     * *//**//*
        JSONObject jo = JSONObject.parseObject(new String(UserData));
        System.out.println(jo);
        *//**//*提取json数据中的X-Access-Token值*//**//*
        String Token = (jo.getJSONObject("data")).getString("X-Access-Token");
        System.out.println(Token);*//*

        String json2 = "{\"devDatapoints\": [\n" +
                "        {\n" +
                "            \"deviceNo\": \"01201721042200004254\",\n" +
                "            \"slaveIndex\": \"1\",\n" +
                "            \"dataPointId\": 5283769\n" +
                "        },\n" +
                "        {\n" +
                "            \"deviceNo\": \"01201721042200004254\",\n" +
                "            \"slaveIndex\": \"1\",\n" +
                "            \"dataPointId\": 5283770\n" +
                "        }\n" +
                "    ]}";
        String TrsdData = HttpPostUtils.postParams("https://openapi.mp.usr.cn/usrCloud/vn/ucloudSdk/getLastDataHistory", json2, Token);
        model.addAttribute("TrsdData", TrsdData);
        *//*将返回的数据转换为json格式*//*
        JSONObject TrsdDatajo = JSONObject.parseObject(new String(TrsdData));
        *//*获取数据中的某个设备的全部数据*//*
        JSONArray dataList1 = (TrsdDatajo.getJSONObject("data")).getJSONArray("list");
        *//*获取设备的某一个键的值，此处设备id*//*
        String dataPointId = dataList1.getJSONObject(0).getString("dataPointId");
        String value = dataList1.getJSONObject(0).getString("value");

        model.addAttribute("dataPointId", dataPointId);
        model.addAttribute("value", value);
        return "data2";
    }*/

    @RequestMapping("/login")
    public String login(ExtendedModelMap model, HttpSession httpSession) {
        return "login";
    }

    @RequestMapping("/login_result")
    public String login_result(HttpServletRequest request, ExtendedModelMap model, HttpSession httpSession) {
        User user = new User();
        user.setUsername(request.getParameter("user"));
        String psw = request.getParameter("password");
        User userByUsername = dqjcMapper.getUserByUserName(user);
        String pswInDb = userByUsername.getUserpsw();
        String slatInDb = userByUsername.getSalt();
        String pswBySalt = md5Util.getHMAC(psw, slatInDb);
        int successFlag = 0;
        if ("" == request.getParameter("user")) {
            model.addAttribute("messageForUser", "未填写用户名");
            successFlag += 1;
        }
        if (null == userByUsername) {
            model.addAttribute("messageForUser", "该用户名不存在");
            successFlag += 1;
        }
        if (!pswInDb.equals(pswBySalt)) {
            model.addAttribute("messageForPsw", "密码错误");
            successFlag += 1;
        }

        if (successFlag == 0) {
            httpSession.setAttribute("loginFlag", 1);
            httpSession.setAttribute("username", userByUsername.getUsername());
            return "home";
        } else {
            return "login";
        }

    }

    @RequestMapping("/register")
    public String register(ExtendedModelMap model, HttpSession httpSession) {
        return "register";
    }

    @RequestMapping(value = "/register_result", method = RequestMethod.POST)
    public String register_result(HttpServletRequest request, ExtendedModelMap model, HttpSession httpSession) {
        User user = new User();
        user.setUsername(request.getParameter("username"));
        user.setEmail(request.getParameter("email"));
        user.setBirthday(request.getParameter("birthday"));
        user.setSex(request.getParameter("gender"));
        user.setName(request.getParameter("name"));
        String psw = request.getParameter("password");
        String tel = request.getParameter("tel");
        String salt = md5Util.getRandomSalt();
        psw = md5Util.getHMAC(psw, salt);
        tel = md5Util.getHMAC(tel, salt);
        user.setSalt(salt);
        user.setUserpsw(psw);
        user.setUserphone(tel);
        User userByUsername = dqjcMapper.getUserByUserName(user);
        User userByName = dqjcMapper.getUserByName(user);
        Boolean pswFlag = CheckPassword.isPswComplex(request.getParameter("password"));
        Boolean emailFlag = CheckEmail.isValidEmail(request.getParameter("email"));
        int successFlag = 0;
        if ("" == request.getParameter("username")) {
            model.addAttribute("messageForUsername", "未填写用户名");
            successFlag += 1;
        }
        if (null != userByUsername) {
            model.addAttribute("messageForUsername", "该用户名已存在");
            successFlag += 1;
        }
        if ("" == request.getParameter("name")) {
            model.addAttribute("messageForName", "未填写姓名");
            successFlag += 1;
        }
        if (null != userByName) {
            model.addAttribute("messageForName", "该姓名已存在");
            successFlag += 1;
        }
        if (11 != request.getParameter("tel").length()) {
            model.addAttribute("messageForTel", "号码长度有误");
            successFlag += 1;
        }
        if (false == pswFlag) {
            model.addAttribute("messageForPsw", "密码格式有误");
            successFlag += 1;
        }
        if (false == emailFlag) {
            model.addAttribute("messageForEmail", "邮件格式有误");
            successFlag += 1;
        }
        if ("" == request.getParameter("birthday")) {
            model.addAttribute("messageForBirthday", "未选择出生日期");
            successFlag += 1;
        }
        if (null == request.getParameter("gender")) {
            model.addAttribute("messageForGender", "未选择性别");
            successFlag += 1;
        }
        model.addAttribute("valueForUsername", request.getParameter("username"));
        model.addAttribute("valueForEmail", request.getParameter("email"));
        model.addAttribute("valueForTel", request.getParameter("tel"));
        model.addAttribute("valueForBirthday", request.getParameter("birthday"));
        model.addAttribute("valueForGender", request.getParameter("gender"));
        model.addAttribute("valueForName", request.getParameter("name"));
        if (0 == successFlag) {
            dqjcMapper.insertUser(user);
            return "register_result";
        } else {
            return "register";
        }
    }

    @RequestMapping("/forget")
    public String forget(ExtendedModelMap model, HttpSession httpSession) {
        return "forget";
    }

    @RequestMapping(value = "/forget_result", method = RequestMethod.POST)
    public String forget_result(HttpServletRequest request, ExtendedModelMap model, HttpSession httpSession) {

        User user = new User();
        user.setUsername(request.getParameter("username"));
        user.setUserphone(request.getParameter("tel"));
        user.setName(request.getParameter("name"));
        String psw = request.getParameter("password");
        String pswAgain = request.getParameter("passwordAgain");
        User userByUsername = dqjcMapper.getUserByUserName(user);


        Boolean pswFlag = CheckPassword.isPswComplex(request.getParameter("password"));
        Boolean pswAgainFlag = CheckPassword.isPswComplex(request.getParameter("passwordAgain"));
        String telInDb = userByUsername.getUserphone();
        String slatInDb = userByUsername.getSalt();
        String telBySalt = md5Util.getHMAC(user.getUserphone(), slatInDb);
        int successFlag = 0;
        if ("" == request.getParameter("username")) {
            model.addAttribute("messageForUsername", "未填写用户名");
            successFlag += 1;
        }
        if (null == userByUsername) {
            model.addAttribute("messageForUsername", "该用户名不存在");
            successFlag += 1;
        }
        if ("" == request.getParameter("name")) {
            model.addAttribute("messageForName", "未填写姓名");
            successFlag += 1;
        }
        if (request.getParameter("name").equals(userByUsername.getUsername())) {
            model.addAttribute("messageForName", "姓名与预留不符，请注意账户安全");
            successFlag += 1;
        }
        if (11 != request.getParameter("tel").length()) {
            model.addAttribute("messageForTel", "号码长度有误");
            successFlag += 1;
        }
        if (!telInDb.equals(telBySalt)) {
            model.addAttribute("messageForTel", "号码与预留不符，请注意账户安全");
            successFlag += 1;
        }
        if (false == pswFlag || false == pswAgainFlag) {
            model.addAttribute("messageForPsw", "密码格式有误");
            model.addAttribute("messageForPswAgain", "密码格式有误");
            successFlag += 1;
        }
        if (!psw.equals(pswAgain)) {
            model.addAttribute("messageForPsw", "两次密码不一致");
            model.addAttribute("messageForPswAgain", "两次密码不一致");
            successFlag += 1;
        }

        model.addAttribute("valueForUsername", request.getParameter("username"));
        model.addAttribute("valueForTel", request.getParameter("tel"));
        model.addAttribute("valueForName", request.getParameter("name"));
        if (0 == successFlag) {
            dqjcMapper.updatePasswordByUsername(user);
            return "forget_result";
        } else {
            return "forget";
        }
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test(ExtendedModelMap model, HttpSession httpSession) {
        return "欢迎使用滴滴出行！";
    }

    @RequestMapping(value = "/testForPost", method = RequestMethod.POST)
    @ResponseBody
    public String testForPost(ExtendedModelMap model, HttpSession httpSession) {
        return "欢迎使用滴滴出行！POST";
    }
}
