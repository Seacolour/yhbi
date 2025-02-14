package com.hang.yhbi.model.dto.chart;

import lombok.Data;

import java.io.Serializable;


/**
 * 图表生成请求
 */
@Data
public class GenChartByAIRequest implements Serializable {


    /**
     * 图表名称
     */
    private String name;


    /**
     * 内容目标
     */
    private String goal;

    /**
     * 图标类型
     */
    private String ChartType;
}
