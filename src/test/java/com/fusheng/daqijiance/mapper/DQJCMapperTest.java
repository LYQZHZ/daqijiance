package com.fusheng.daqijiance.mapper;

import com.fusheng.daqijiance.DaqijianceApplication;
import com.fusheng.daqijiance.model.User;
import com.fusheng.daqijiance.utils.md5Util;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DaqijianceApplication.class)
public class DQJCMapperTest {
    @Resource
    private DQJCMapper dqjcMapper;

    @Test
    public void insertUser() {
        User user = new User();
        String salt = md5Util.getRandomSalt();
        System.out.println("salt:" + salt);
        user.setSalt(salt);
        user.setUsername("lyq");
        user.setUserphone(md5Util.getHMAC("18333265801", salt));
        user.setUserpsw(md5Util.getHMAC("12345", salt));
        user.setEmail(md5Util.getHMAC("941680745@qq.com", salt));
        dqjcMapper.insertUser(user);

    }

    @Test
    public void getUser() {
        User user = new User();
        String salt = md5Util.getRandomSalt();
        System.out.println("salt:" + salt);
        user.setSalt(salt);
        user.setUsername("lyq");
        user.setUserphone(md5Util.getHMAC("18333265801", salt));
        user.setUserpsw(md5Util.getHMAC("12345", salt));
        user.setEmail(md5Util.getHMAC("941680745@qq.com", salt));
        dqjcMapper.insertUser(user);

    }

    @Test
    public void testGetUser() {
        User user = new User();
        user.setUsername("lyq");
        user = dqjcMapper.getUserByUserName(user);
        String newPsw = md5Util.getHMAC("12345", user.getSalt());
        assertEquals(newPsw, user.getUserpsw());
    }
}