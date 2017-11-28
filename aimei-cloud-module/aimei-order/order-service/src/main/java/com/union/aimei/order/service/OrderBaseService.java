package com.union.aimei.order.service;

import com.union.aimei.order.entity.OrderBase;
import com.union.common.base.BaseService;
import com.union.common.base.datatables.model.DataTable;
import com.union.common.base.datatables.model.SearchCondition;
import com.union.common.utils.ResponseMessage;

public interface OrderBaseService extends BaseService<OrderBase> {
       /**
     * 后台分页查询order_base
     * @param sc  分页查询参数
     * @param orderBase 查询条件
     * @return
     */
       DataTable findByPage(SearchCondition sc, OrderBase orderBase);

       /**
     * 前端分页查询order_base
     * @param pageNo  分页索引
     * @param pageSize  每页显示数量
     * @param orderBase 查询条件
     * @return 
     */
       ResponseMessage findByPageForFront(Integer pageNo, Integer pageSize, OrderBase orderBase);
}