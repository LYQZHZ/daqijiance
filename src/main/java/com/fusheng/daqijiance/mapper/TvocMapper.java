package com.fusheng.daqijiance.mapper;

import com.fusheng.daqijiance.model.DaQiShuJu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TvocMapper {

    DaQiShuJu getTvocLastOne();

    List<DaQiShuJu> getTvocLastSevenDay();

    List<DaQiShuJu> getTvocLastFive();
}
