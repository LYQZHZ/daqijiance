package com.fusheng.daqijiance.model;

import lombok.Data;

@Data
public class DaQiShuJu {
    /**
     * 数据库唯一id值
     */
    private int uniq_id;
    /**
     * 设备id，不关注
     */
    private String dataPointId;
    /**
     * 设备号，不关注
     */
    private String deviceNo;
    /**
     * 参数英文名
     */
    private String name;
    /**
     * 参数单位
     */
    private String unit;
    /**
     * 参数具体值
     */
    private Double value;
    /**
     * 参数值记录时间
     */
    private String date;
    /**
     * 其他相关描述
     */
    private String description = "";
}
