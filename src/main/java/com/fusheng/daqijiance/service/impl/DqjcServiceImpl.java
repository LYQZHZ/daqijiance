package com.fusheng.daqijiance.service.impl;

import com.fusheng.daqijiance.mapper.*;
import com.fusheng.daqijiance.model.DaQiShuJu;
import com.fusheng.daqijiance.model.ResponseData;
import com.fusheng.daqijiance.service.DqjcService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Slf4j
@Service
public class DqjcServiceImpl implements DqjcService {
    @Autowired
    DQJCMapper dqjcMapper;
    @Autowired
    Nh3Mapper nh3Mapper;
    @Autowired
    No2Mapper no2Mapper;
    @Autowired
    Co2Mapper co2Mapper;
    @Autowired
    CoMapper coMapper;
    @Autowired
    TvocMapper tvocMapper;
    public ResponseData getAllDQSJLastOne() {
        ResponseData responseData = new ResponseData();
        List<DaQiShuJu> daQiShuJuList = new ArrayList<>();
        DaQiShuJu DaQiShuJu = new DaQiShuJu();
        try {
            responseData.setCode("200");
            DaQiShuJu = nh3Mapper.getNh3LastOne();
            daQiShuJuList.add(DaQiShuJu);

            DaQiShuJu = co2Mapper.getCo2LastOne();
            daQiShuJuList.add(DaQiShuJu);

            DaQiShuJu = no2Mapper.getNo2LastOne();
            daQiShuJuList.add(DaQiShuJu);

            DaQiShuJu = coMapper.getCoLastOne();
            daQiShuJuList.add(DaQiShuJu);

            DaQiShuJu = tvocMapper.getTvocLastOne();
            daQiShuJuList.add(DaQiShuJu);


            responseData.setData(daQiShuJuList);
            responseData.setMessage("success");

        } catch (Exception e) {
            log.error(e.getMessage());
            responseData.setCode("400");
            responseData.setMessage("Data error! Please contact administrator.");
        }

        return responseData;
    }
}
