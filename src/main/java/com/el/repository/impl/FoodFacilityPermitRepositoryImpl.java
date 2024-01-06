package com.el.repository.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.el.mapper.FoodFacilityPermitMapper;
import com.el.model.FoodFacilityPermit;
import com.el.repository.FoodFacilityPermitRepository;
import com.el.util.BeanVoDtoUtils;
import com.el.util.QueryUtil;
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
public class FoodFacilityPermitRepositoryImpl extends ServiceImpl<FoodFacilityPermitMapper, FoodFacilityPermit> implements FoodFacilityPermitRepository {

    @Autowired
    private FoodFacilityPermitMapper foodFacilityPermitMapper;

    @Override
    public List<FoodFacilityPermitListResultVo> getFacilityList() {
        List<FoodFacilityPermit> foodFacilityPermitsList = foodFacilityPermitMapper.selectList(
                new QueryWrapper<FoodFacilityPermit>().eq("Status","APPROVED"));
        List<FoodFacilityPermitListResultVo> list = BeanVoDtoUtils.listVo(foodFacilityPermitsList, FoodFacilityPermitListResultVo.class);
        return list;
    }

    @Override
    public PageDto<FoodFacilityPermitListResultVo> listByPage(QueryPageDto pageDto) {
        IPage<FoodFacilityPermit> page = foodFacilityPermitMapper.selectPage(
                new QueryUtil<FoodFacilityPermit>().getPage(pageDto),
                new QueryWrapper<FoodFacilityPermit>().eq("Status","APPROVED"));
        List<FoodFacilityPermitListResultVo> list = BeanVoDtoUtils.listVo(page.getRecords(), FoodFacilityPermitListResultVo.class);
        return new QueryUtil<FoodFacilityPermitListResultVo>().toPageDto(list, page.getTotal());
    }

    @Override
    public FoodFacilityPermitDetailVo getDetail(Long locationId) {
        FoodFacilityPermit foodFacilityPermit = foodFacilityPermitMapper.selectById(locationId);
        FoodFacilityPermitDetailVo result = BeanVoDtoUtils.convert(foodFacilityPermit, FoodFacilityPermitDetailVo.class);
        return result;
    }
}
