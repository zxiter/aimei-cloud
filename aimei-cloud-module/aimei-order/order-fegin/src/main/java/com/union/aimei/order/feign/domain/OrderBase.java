package com.union.aimei.order.feign.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@ApiModel(value="order_base")
public class OrderBase {
    @ApiModelProperty("主键ID")
    private Integer id;

    @ApiModelProperty("订单编号")
    private String orderNo;

    @ApiModelProperty("订单金额")
    private Integer orderAmount;

    private static final long serialVersionUID = 1L;
}
