package com.union.aimei.order.controller;

import com.union.aimei.order.entity.OrderBase;
import com.union.aimei.order.service.OrderBaseService;
import com.union.common.base.datatables.DTable;
import com.union.common.base.datatables.model.DataTable;
import com.union.common.base.datatables.model.SearchCondition;
import com.union.common.utils.ResponseMessage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestParam;

@Api(tags="order_base")
@RestController
public class OrderBaseController {
       @Resource
       private OrderBaseService orderBaseService;

       @ApiOperation(httpMethod="POST", value="后台分页查询order_base")
       @PostMapping("/bg/findByPage")
       public DataTable findByPage(@ApiParam(value="后台分页查询参数") @DTable SearchCondition sc,
	@ApiParam(value="查询条件") OrderBase orderBase) {
              return this.orderBaseService.findByPage(sc,orderBase);
       }

       @ApiOperation(httpMethod="POST", value="前端分页查询order_base")
       @PostMapping("/front/findByPage")
       public ResponseMessage<OrderBase> findByPageForFront(@ApiParam(value="分页索引",defaultValue="0")  @RequestParam(defaultValue="0")
	 Integer pageNo, @ApiParam(value="每页数量",defaultValue="10")  @RequestParam(defaultValue="10")
	 Integer pageSize, @ApiParam(value="查询条件") OrderBase orderBase) {
              return this.orderBaseService.findByPageForFront(pageNo,pageSize,orderBase);
       }

       @ApiOperation(httpMethod="POST", value="添加order_base")
       @PostMapping("/insert")
       public ResponseMessage<OrderBase> insert(@RequestBody OrderBase orderBase) {
              return this.orderBaseService.addObj(orderBase);
       }

       @ApiOperation(httpMethod="GET", value="删除order_base")
       @GetMapping("/deleteById/{id}")
       public ResponseMessage<OrderBase> deleteById(@PathVariable int id) {
              return this.orderBaseService.deleteObjById(id);
       }

       @ApiOperation(httpMethod="POST", value="编辑order_base")
       @PostMapping("/edit")
       public ResponseMessage<OrderBase> edit(@RequestBody OrderBase orderBase) {
              return this.orderBaseService.modifyObj(orderBase);
       }

       @ApiOperation(httpMethod="GET", value="通过ID查询order_base")
       @GetMapping("/queryById/{id}")
       public ResponseMessage<OrderBase> queryById(@PathVariable int id) {
              return this.orderBaseService.queryObjById(id);
       }
}