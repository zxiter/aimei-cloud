package com.union.aimei.order.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.io.Serializable;

@Data
@EqualsAndHashCode
@ApiModel(value="order_base")
public class OrderBase implements Serializable {
    @ApiModelProperty("主键ID")
    private Integer id;

    @ApiModelProperty("订单编号")
    private String orderNo;

    @ApiModelProperty("订单金额")
    private Integer orderAmount;

    private static final long serialVersionUID = 1L;
}
