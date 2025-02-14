package com.hang.yhbi.service;

import co.elastic.clients.elasticsearch.sql.QueryRequest;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hang.yhbi.model.dto.chart.ChartQueryRequest;
import com.hang.yhbi.model.dto.post.PostQueryRequest;
import com.hang.yhbi.model.entity.Chart;
import com.hang.yhbi.model.entity.Post;


/**
 * @author guo
 * @description 针对表【chart(图表信息表)】的数据库操作Service
 * @createDate 2024-11-26 21:25:09
 */
public interface ChartService extends IService<Chart> {


    /**
     * 获取查询条件
     *
     * @param chartQueryRequest
     * @return
     */
    QueryWrapper<Chart> getQueryWrapper(ChartQueryRequest chartQueryRequest);
}
