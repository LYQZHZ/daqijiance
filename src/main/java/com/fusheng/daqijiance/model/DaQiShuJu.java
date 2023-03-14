package com.fusheng.daqijiance.model;

import lombok.Data;

@Data
public class DaQiShuJu {
    private int uniq_id;

    private String dataPointId;
    private String deviceNo;

    private String name;
    private String unit;

    private Double value;
    private String date;

    private String description = "";
}
