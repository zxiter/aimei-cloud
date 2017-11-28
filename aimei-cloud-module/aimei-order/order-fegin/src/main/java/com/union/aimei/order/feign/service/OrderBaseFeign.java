package com.union.aimei.order.feign.service;

import com.union.aimei.order.feign.service.hystrix.OrderBaseFeignHystrix;
import com.union.common.utils.ResponseMessage;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "ORDERSERVICE",fallback = OrderBaseFeignHystrix.class)
public interface OrderBaseFeign {

    @GetMapping(value = "/queryById/{id}")
    ResponseMessage queryById(@PathVariable(value = "id")Integer id);
}
