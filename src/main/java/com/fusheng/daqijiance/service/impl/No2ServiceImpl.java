package com.fusheng.daqijiance.service.impl;

import com.fusheng.daqijiance.mapper.No2Mapper;
import com.fusheng.daqijiance.model.DaQiShuJu;
import com.fusheng.daqijiance.model.ResponseData;
import com.fusheng.daqijiance.service.No2Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class No2ServiceImpl implements No2Service {
    @Autowired
    No2Mapper no2Mapper;

    @Override
    public ResponseData getNo2SevenDay() {
        ResponseData responseData = new ResponseData();
        try {
            List<DaQiShuJu> daQiShuJuList = no2Mapper.getNo2LastSevenDay();
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
    public ResponseData getNo2Five() {
        ResponseData responseData = new ResponseData();
        Double maxValue = 0.0;
        DaQiShuJu maxDaQiShuJu = new DaQiShuJu();
        try {
            List<DaQiShuJu> daQiShuJuList = no2Mapper.getNo2LastFive();
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
