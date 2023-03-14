package com.fusheng.daqijiance.service.impl;

import com.fusheng.daqijiance.mapper.Co2Mapper;
import com.fusheng.daqijiance.model.DaQiShuJu;
import com.fusheng.daqijiance.model.ResponseData;
import com.fusheng.daqijiance.service.Co2Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class Co2ServiceImpl implements Co2Service {
    @Autowired
    Co2Mapper co2Mapper;

    @Override
    public ResponseData getCo2SevenDay() {
        ResponseData responseData = new ResponseData();
        try {
            List<DaQiShuJu> daQiShuJuList = co2Mapper.getCo2LastSevenDay();
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
    public ResponseData getCo2Five() {
        ResponseData responseData = new ResponseData();
        Double maxValue = 0.0;
        DaQiShuJu maxDaQiShuJu = new DaQiShuJu();
        try {
            List<DaQiShuJu> daQiShuJuList = co2Mapper.getCo2LastFive();
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
