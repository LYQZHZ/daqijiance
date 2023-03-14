package com.fusheng.daqijiance.mapper;

import com.fusheng.daqijiance.model.DaQiShuJu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface No2Mapper {

    DaQiShuJu getNo2LastOne();

    List<DaQiShuJu> getNo2LastSevenDay();

    List<DaQiShuJu> getNo2LastFive();
}
