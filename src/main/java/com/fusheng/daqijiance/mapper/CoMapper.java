package com.fusheng.daqijiance.mapper;

import com.fusheng.daqijiance.model.DaQiShuJu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CoMapper {

    DaQiShuJu getCoLastOne();

    List<DaQiShuJu> getCoLastSevenDay();

    List<DaQiShuJu> getCoLastFive();
}
