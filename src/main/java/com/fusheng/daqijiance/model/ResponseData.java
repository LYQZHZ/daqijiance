package com.fusheng.daqijiance.model;

import lombok.Data;

import java.util.List;

@Data
public class ResponseData {
    private String code;
    private List<DaQiShuJu> data;
    private String message;
}
