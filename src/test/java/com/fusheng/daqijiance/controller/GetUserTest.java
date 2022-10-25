package com.fusheng.daqijiance.controller;

import com.fusheng.daqijiance.DaqijianceApplication;
import com.fusheng.daqijiance.mapper.DQJCMapper;
import com.fusheng.daqijiance.model.UserToken;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DaqijianceApplication.class)
public class GetUserTest {
    @Resource
    private DQJCMapper dqjcMapper;

    @Test
    public void getToken() {
        UserToken TOKEN = dqjcMapper.getUserToken();
        System.out.println(TOKEN);
    }
}