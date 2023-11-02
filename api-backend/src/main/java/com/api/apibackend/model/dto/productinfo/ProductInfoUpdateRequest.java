package com.api.apibackend.model.dto.productinfo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description: 产品信息更新请求
 */
@Data
public class ProductInfoUpdateRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * id
     */
    private long id;

    /**
     * 产品名称
     */
    private String name;

    /**
     * 产品描述
     */
    private String description;


    /**
     * 金额
     */
    private Double total;

    /**
     * 增加积分个数
     */
    private Integer addPoints;

    /**
     * 产品类型（VIP-VIP会员 RECHARGE-积分充值 RECHARGEACTIVITY-充值活动）
     */
    private String productType;

    /**
     * 过期时间
     */
    private Date expirationTime;
}