package com.fusheng.daqijiance.service.impl;

import com.fusheng.daqijiance.mapper.TvocMapper;
import com.fusheng.daqijiance.model.DaQiShuJu;
import com.fusheng.daqijiance.model.ResponseData;
import com.fusheng.daqijiance.service.TvocService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class TvocServiceImpl implements TvocService {
    @Autowired
    TvocMapper tvocMapper;

    @Override
    public ResponseData getTvocSevenDay() {
        ResponseData responseData = new ResponseData();
        try {
            List<DaQiShuJu> daQiShuJuList = tvocMapper.getTvocLastSevenDay();
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
    public ResponseData getTvocFive() {
        ResponseData responseData = new ResponseData();
        Double maxValue = 0.0;
        DaQiShuJu maxDaQiShuJu = new DaQiShuJu();
        try {
            List<DaQiShuJu> daQiShuJuList = tvocMapper.getTvocLastFive();
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
