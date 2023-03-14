package com.fusheng.daqijiance.mapper;


import com.fusheng.daqijiance.model.DaQiShuJu;
import com.fusheng.daqijiance.model.User;
import com.fusheng.daqijiance.model.UserToken;

@org.apache.ibatis.annotations.Mapper
public interface DQJCMapper {
    int insertToken(UserToken usertoken);

    int deleteAllUserToken();

    UserToken getUserToken();

    int insertCo(DaQiShuJu daQiShuJu);

    int insertCo2(DaQiShuJu daQiShuJu);

    int insertNh3(DaQiShuJu daQiShuJu);

    int insertNo2(DaQiShuJu daQiShuJu);

    int insertTvoc(DaQiShuJu daQiShuJu);

    int insertUser(User user);

    User getUserByUserName(User user);

    User getUserByName(User user);

    int updatePasswordByUsername(User user);
}
