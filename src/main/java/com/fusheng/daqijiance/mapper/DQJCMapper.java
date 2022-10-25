package com.fusheng.daqijiance.mapper;


import com.fusheng.daqijiance.model.TuRangShuJu;
import com.fusheng.daqijiance.model.User;
import com.fusheng.daqijiance.model.UserToken;

@org.apache.ibatis.annotations.Mapper
public interface DQJCMapper {
    int insertToken(UserToken usertoken);

    int deleteAllUserToken();

    UserToken getUserToken();

    int insertCo(TuRangShuJu tuRangShuJu);

    int insertCo2(TuRangShuJu tuRangShuJu);

    int insertNh3(TuRangShuJu tuRangShuJu);

    int insertNo2(TuRangShuJu tuRangShuJu);

    int insertTvoc(TuRangShuJu tuRangShuJu);

    int insertUser(User user);

    User getUserByUserName(User user);

    User getUserByName(User user);

    int updatePasswordByUsername(User user);
}
