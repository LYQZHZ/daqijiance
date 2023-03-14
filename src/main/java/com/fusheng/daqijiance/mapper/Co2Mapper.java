package com.fusheng.daqijiance.mapper;

import com.fusheng.daqijiance.model.DaQiShuJu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Co2Mapper {
    DaQiShuJu getCo2LastOne();

    List<DaQiShuJu> getCo2LastSevenDay();

    List<DaQiShuJu> getCo2LastFive();
}
