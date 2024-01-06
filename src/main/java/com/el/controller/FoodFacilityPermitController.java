package com.el.controller;


import com.el.service.FoodFacilityPermitService;
import com.el.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * Mobile Food Facility Permit 前端控制器
 * </p>
 *
 * @author derek
 * @since 2024-01-06
 */
@RestController
@RequestMapping("/food-facility-permit")
public class FoodFacilityPermitController {

    @Autowired
    private FoodFacilityPermitService foodFacilityPermitService;

    /**
     * list all the food-facilities
     * @return List<FoodFacilityPermitListResultVo>
     */
    @GetMapping("/listAll")
    public ApiResult<List<FoodFacilityPermitListResultVo>> listAll() {
        List<FoodFacilityPermitListResultVo> list = foodFacilityPermitService.getFacilityList();
        return ApiResult.success(list);
    }

    /**
     * list all the food-facilities by page
     * @param pageNum
     * @param pageSize
     * @return PageDto<FoodFacilityPermitListResultVo>
     */
    @GetMapping("/listByPage")
    public ApiResult<PageDto<FoodFacilityPermitListResultVo>> listByPage(@RequestParam("pageNum")int pageNum,@RequestParam("pageSize")int pageSize) {
        QueryPageDto pageDto = new QueryPageDto();
        pageDto.setPageNum(pageNum);
        pageDto.setPageSize(pageSize);
        PageDto<FoodFacilityPermitListResultVo> list = foodFacilityPermitService.listByPage(pageDto);
        return ApiResult.success(list);
    }

    /**
     * show food facilities details by locationId
     * @param locationId
     * @return FoodFacilityPermitDetailVo
     */
    @GetMapping("/detail")
    public ApiResult<FoodFacilityPermitDetailVo> detail(@RequestParam("id") Long locationId) {
        FoodFacilityPermitDetailVo detail = foodFacilityPermitService.getDetail(locationId);
        return ApiResult.success(detail);
    }

}
