package com.el.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.el.mapper.FoodFacilityPermitMapper;
import com.el.model.FoodFacilityPermit;
import com.el.repository.FoodFacilityPermitRepository;
import com.el.service.FoodFacilityPermitService;
import com.el.vo.FoodFacilityPermitDetailVo;
import com.el.vo.FoodFacilityPermitListResultVo;
import com.el.vo.PageDto;
import com.el.vo.QueryPageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * Mobile Food Facility Permit 服务实现类
 * </p>
 *
 * @author derek
 * @since 2024-01-06
 */
@Service
public class FoodFacilityPermitServiceImpl  implements FoodFacilityPermitService {

    @Autowired
    private FoodFacilityPermitRepository foodFacilityPermitRepository;


    @Override
    public List<FoodFacilityPermitListResultVo> getFacilityList() {
        List<FoodFacilityPermitListResultVo> list = foodFacilityPermitRepository.getFacilityList();
        return list;
    }

    @Override
    public PageDto<FoodFacilityPermitListResultVo> listByPage(QueryPageDto pageDto) {
        PageDto<FoodFacilityPermitListResultVo> resultVoPageDto = foodFacilityPermitRepository.listByPage(pageDto);
        return resultVoPageDto;
    }

    @Override
    public FoodFacilityPermitDetailVo getDetail(Long locationId) {
        FoodFacilityPermitDetailVo result = foodFacilityPermitRepository.getDetail(locationId);
        return result;
    }
}
