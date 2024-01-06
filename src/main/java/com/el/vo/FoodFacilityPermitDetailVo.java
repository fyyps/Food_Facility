package com.el.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class FoodFacilityPermitDetailVo {

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
     * cnn
     */
    private String cnn;

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
     * permit
     */
    private String permit;

    /**
     * Status
     */
    @TableField("Status")
    private String status;

    /**
     * FoodItems
     */
    private String foodItems;

    /**
     * X
     */
    @TableField("X")
    private String x;

    /**
     * Y
     */
    @TableField("Y")
    private String y;

    /**
     * Latitude
     */
    private String latitude;

    /**
     * Longitude
     */
    private String longitude;

    /**
     * Schedule
     */
    private String schedule;

    /**
     * dayshours
     */
    private String dayshours;

    /**
     * NOISent
     */
    @TableField("NOISent")
    private String noisent;

    /**
     * Approved
     */
    private LocalDateTime approved;

    /**
     * Received
     */
    private String received;

    /**
     * PriorPermit
     */
    @TableField("priorPermit")
    private Integer priorpermit;

    /**
     * ExpirationDate
     */
    private LocalDateTime expirationDate;

    /**
     * Location
     */
    private String location;

    /**
     * Fire Prevention Districts
     */
    private Integer firePreventionDistricts;

    /**
     * Police Districts
     */
    private Integer policeDistricts;

    /**
     * Supervisor Districts
     */
    private Integer supervisorDistricts;

    /**
     * Zip Codes
     */
    private String zipCodes;

    /**
     * Neighborhoods (old)
     */
    private Integer neighborhoods;

}
