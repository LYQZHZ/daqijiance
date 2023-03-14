package com.fusheng.daqijiance.service.impl;

import com.fusheng.daqijiance.mapper.Nh3Mapper;
import com.fusheng.daqijiance.model.DaQiShuJu;
import com.fusheng.daqijiance.model.ResponseData;
import com.fusheng.daqijiance.service.Nh3Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class Nh3ServiceImpl implements Nh3Service {
    @Autowired
    Nh3Mapper nh3Mapper;

    @Override
    public ResponseData getNh3SevenDay() {
        ResponseData responseData = new ResponseData();
        try {
            List<DaQiShuJu> daQiShuJuList = nh3Mapper.getNh3LastSevenDay();
            responseData.setCode("200");
            responseData.setData(daQiShuJuList);
            responseData.setMessage("success");

        } catch (Exception e) {
            log.error(e.getMessage());
            responseData.setCode("400");
            responseData.setMessage("Data error! Please contact administrator.");
        }

        return responseData;
    }

    @Override
    public ResponseData getNh3Five() {
        ResponseData responseData = new ResponseData();
        Double maxValue = 0.0;
        DaQiShuJu maxDaQiShuJu = new DaQiShuJu();
        try {
            List<DaQiShuJu> daQiShuJuList = nh3Mapper.getNh3LastFive();
            for (DaQiShuJu daQiShuJu : daQiShuJuList) {
                if (daQiShuJu.getValue() > maxValue) {
                    maxValue = daQiShuJu.getValue();
                    maxDaQiShuJu = daQiShuJu;
                }
            }
            responseData.setCode("200");
            responseData.setData(daQiShuJuList);
            responseData.setMessage(maxDaQiShuJu.getDate());
        } catch (Exception e) {
            log.error(e.getMessage());
            responseData.setCode("400");
            responseData.setMessage("Data error! Please contact administrator.");
        }

        return responseData;
    }
}
