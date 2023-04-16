package com.fusheng.daqijiance.controller;

import com.fusheng.daqijiance.model.ResponseData;
import com.fusheng.daqijiance.model.UserBjh;
import com.fusheng.daqijiance.service.UserBjhService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户相关综合接口
 */
@Slf4j
@CrossOrigin
@Controller
@RequestMapping(value = "/userBjh")
public class PolyUserController {
    @Autowired
    UserBjhService userBjhService;

    /**
     * 用户相关综合接口
     * 该接口具备三个能力：1。登录；2.注册；3.修改密码。登录会验证该用户名是否存在，验证密码是否正确；注册会验证该用户名是否存在，如果存在则返回错误信息；修改只会验证该用户名是否存在，但不会做身份验证。调用的时候需传入能力选择标志，具体请移步请求参数说明查看。
     *
     * @param userBjh
     * @return
     */
    @RequestMapping(value = "/polyUser", method = RequestMethod.POST)
    @ResponseBody
    public ResponseData polyUser(UserBjh userBjh) {
        ResponseData responseData = new ResponseData();
        try {
            responseData = userBjhService.polyUser(userBjh);

        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.getMessage());
        }
        return responseData;
    }
}
