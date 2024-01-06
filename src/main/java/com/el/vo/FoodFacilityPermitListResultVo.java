package com.el.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class FoodFacilityPermitListResultVo {

    /**
     * id
     */
    @TableId
    private Long locationId;

    /**
     * Applicant
     */
    private String applicant;

    /**
     * FacilityType
     */
    private String facilityType;


    /**
     * LocationDescription
     */
    private String locationDescription;

    /**
     * Address
     */
    private String address;

    /**
     * blocklot
     */
    private String blockLot;

    /**
     * block
     */
    private String block;

    /**
     * lot
     */
    private String lot;

    /**
     * Status
     */
    @TableField("Status")
    private String status;

    /**
     * FoodItems
     */
    private String foodItems;


}
