package com.union.aimei.order.feign.controller;

import com.union.aimei.order.feign.domain.OrderBase;
import com.union.aimei.order.feign.service.OrderBaseFeign;
import com.union.common.utils.ResponseMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderBaseFeignController {
    @Resource
    OrderBaseFeign orderBaseFeign;

    @GetMapping(value = "queryById/{id}")
    public ResponseMessage<OrderBase> queryById(@PathVariable(value = "id")Integer id){
        ResponseMessage<OrderBase> responseMessage= orderBaseFeign.queryById(id);
        return  responseMessage;
    }

}
