package com.union.aimei.order.feign.service.hystrix;

import com.union.aimei.order.feign.service.OrderBaseFeign;
import com.union.common.utils.ResponseMessage;
import org.springframework.stereotype.Component;

@Component
public class OrderBaseFeignHystrix implements OrderBaseFeign {
    @Override
    public ResponseMessage queryById(Integer id) {
        ResponseMessage responseMessage=new ResponseMessage();
        responseMessage.setCode(201);
        responseMessage.setMessage("fail");
        return responseMessage;
    }
}
