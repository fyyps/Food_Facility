package com.el.repository;

import com.baomidou.mybatisplus.extension.service.IService;
import com.el.model.FoodFacilityPermit;
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
public interface FoodFacilityPermitRepository extends IService<FoodFacilityPermit> {

    List<FoodFacilityPermitListResultVo> getFacilityList();

    PageDto<FoodFacilityPermitListResultVo> listByPage(QueryPageDto pageDto);

    FoodFacilityPermitDetailVo getDetail(Long locationId);
}
