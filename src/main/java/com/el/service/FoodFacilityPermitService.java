package com.el.service;

import com.el.vo.FoodFacilityPermitDetailVo;
import com.el.vo.FoodFacilityPermitListResultVo;
import com.el.vo.PageDto;
import com.el.vo.QueryPageDto;

import java.util.List;

/**
 * <p>
 * Mobile Food Facility Permit 服务类
 * </p>
 *
 * @author derek
 * @since 2024-01-06
 */
public interface FoodFacilityPermitService  {

    /**
     * list all the food-facilities
     * @return List<FoodFacilityPermitListResultVo>
     */
    List<FoodFacilityPermitListResultVo> getFacilityList();

    /**
     * list all the food-facilities by page
     * @param pageDto
     * @return PageDto<FoodFacilityPermitListResultVo>
     */
    PageDto<FoodFacilityPermitListResultVo> listByPage(QueryPageDto pageDto);

    /**
     * show food facilities details by locationId
     * @param locationId
     * @return FoodFacilityPermitDetailVo
     */
    FoodFacilityPermitDetailVo getDetail(Long locationId);
}
