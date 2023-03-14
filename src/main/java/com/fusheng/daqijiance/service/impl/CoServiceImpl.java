package com.fusheng.daqijiance.service.impl;

import com.fusheng.daqijiance.mapper.CoMapper;
import com.fusheng.daqijiance.model.DaQiShuJu;
import com.fusheng.daqijiance.model.ResponseData;
import com.fusheng.daqijiance.service.CoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CoServiceImpl implements CoService {
    @Autowired
    CoMapper coMapper;

    @Override
    public ResponseData getCoSevenDay() {
        ResponseData responseData = new ResponseData();
        try {
            List<DaQiShuJu> daQiShuJuList = coMapper.getCoLastSevenDay();
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
    public ResponseData getCoFive() {
        ResponseData responseData = new ResponseData();
        Double maxValue = 0.0;
        DaQiShuJu maxDaQiShuJu = new DaQiShuJu();
        try {
            List<DaQiShuJu> daQiShuJuList = coMapper.getCoLastFive();
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
