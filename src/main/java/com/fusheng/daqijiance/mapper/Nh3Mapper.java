package com.fusheng.daqijiance.mapper;

import com.fusheng.daqijiance.model.DaQiShuJu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Nh3Mapper {
    DaQiShuJu getNh3LastOne();

    List<DaQiShuJu> getNh3LastSevenDay();

    List<DaQiShuJu> getNh3LastFive();
}
