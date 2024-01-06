/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package com.el.util;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.el.vo.PageDto;
import com.el.vo.QueryPageDto;

import java.util.List;

/**
 * @author derek
 * @date 2022/1/18 13:04
 * 查询参数
 */
public class QueryUtil<T> {

    public static <T> PageDto<T> toPageDto(List<T> records,Long total) {
        PageDto<T> pageDto = new PageDto();
        pageDto.setList(records);
        pageDto.setTotal(total);
        return pageDto;
    }


    public static <T> PageDto<T> toPageDto(IPage<T> iPage) {
        PageDto<T> pageDto = new PageDto();
        pageDto.setList(iPage.getRecords());
        pageDto.setTotal(iPage.getTotal());
        return pageDto;
    }


    public IPage<T> getPage(QueryPageDto params) {
        //默认分页参数
        long curPage = 1;
        long limit = 10;

        if(params.getPageNum() != null){
            curPage = params.getPageNum();
        }
        if(params.getPageSize() != null){
            limit = params.getPageSize();
        }

        //分页对象
        Page<T> page = new Page<>(curPage, limit);

        return page;
    }


    public IPage<T> getPage(QueryPageDto params, List<OrderItem> items) {
        //默认分页参数
        long curPage = 1;
        long limit = 10;

        if(params.getPageNum() != null){
            curPage = params.getPageNum();
        }
        if(params.getPageSize() != null){
            limit = params.getPageSize();
        }

        //分页对象
        Page<T> page = new Page<>(curPage, limit);
        page.addOrder(items);
        return page;
    }
}
