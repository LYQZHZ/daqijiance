package com.fusheng.daqijiance.model;

import lombok.Data;

import java.util.List;

@Data
public class ResponseData {
    /**
     * 响应状态码
     */
    private String code;
    /**
     * 响应数据
     */
    private List<DaQiShuJu> data;
    /**
     * 响应对应提示
     */
    private String message;
    /**
     * 县区数据库id
     */
    private Long countyId;
    /**
     * 县区名称
     */
    private String countyName;


    public ResponseData(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResponseData(String code, String message, Long countyId, String countyName) {
        this.code = code;
        this.message = message;
        this.countyId = countyId;
        this.countyName = countyName;
    }

    public ResponseData() {
    }
}
