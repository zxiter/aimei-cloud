package com.union.aimei.order.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.union.aimei.order.entity.OrderBase;
import com.union.aimei.order.mapper.OrderBaseMapper;
import com.union.aimei.order.service.OrderBaseService;
import java.util.List;
import javax.annotation.Resource;

import com.union.common.base.datatables.model.DataTable;
import com.union.common.base.datatables.model.SearchCondition;
import com.union.common.utils.AssertUtil;
import com.union.common.utils.PageUtils;
import com.union.common.utils.ResponseMessage;
import com.union.common.utils.ResponseMessageFactory;
import com.union.common.utils.constant.ResponseContants;
import org.springframework.stereotype.Service;

@Service("orderBaseService")
public class OrderBaseServiceImpl implements OrderBaseService {
       @Resource
       private OrderBaseMapper orderBaseMapper;

       //后台分页查询order_base
       @Override
       public DataTable findByPage(SearchCondition sc, OrderBase orderBase) {
              PageHelper.startPage(sc.getPage(),sc.getRows());
              List<OrderBase> list = this.orderBaseMapper.selectListByConditions(orderBase);
              PageInfo<OrderBase> page = new PageInfo<>(list);
              return new PageUtils<OrderBase>(sc.getDraw(),page).getDataTable();
       }

       //前端分页查询order_base
       @Override
       public ResponseMessage<OrderBase> findByPageForFront(Integer pageNo, Integer pageSize, OrderBase orderBase) {
               ResponseMessage result = ResponseMessageFactory.newInstance();
              PageHelper.startPage(pageNo,pageSize);
              List<OrderBase> list = this.orderBaseMapper.selectListByConditions(orderBase);
              PageInfo<OrderBase> page = new PageInfo<>(list);
              result.setData(new PageUtils<>(page).getPageViewDatatable());
              return result;
       }

       //添加order_base
       @Override
       public ResponseMessage<OrderBase> addObj(OrderBase t) {
              ResponseMessage result = ResponseMessageFactory.newInstance();
              int res=this.orderBaseMapper.insertSelective(t);
              AssertUtil.numberGtZero(res, ResponseContants.ADD_MESSAGE,ResponseContants.ADD);
              return result;
       }

       //删除order_base
       @Override
       public ResponseMessage<OrderBase> deleteObjById(int id) {
              ResponseMessage result = ResponseMessageFactory.newInstance();
              int res=this.orderBaseMapper.deleteByPrimaryKey(id);
              AssertUtil.numberGtZero(res,ResponseContants.DELETE_MESSAGE,ResponseContants.DELETE);
              return result;
       }

       //修改order_base
       @Override
       public ResponseMessage<OrderBase> modifyObj(OrderBase t) {
              ResponseMessage result = ResponseMessageFactory.newInstance();
              int res=this.orderBaseMapper.updateByPrimaryKeySelective(t);
              AssertUtil.numberGtZero(res,ResponseContants.EDIT_MESSAGE,ResponseContants.EDIT);
              return result;
       }

       //根据ID查询order_base
       @Override
       public ResponseMessage<OrderBase> queryObjById(int id) {
              ResponseMessage result = ResponseMessageFactory.newInstance();
              OrderBase model=this.orderBaseMapper.selectByPrimaryKey(id);
              AssertUtil.notNull(model,ResponseContants.QUERY_EMPTY_MESSAGE,ResponseContants.QUERY_EMPTY);
              result.setData(model);
              return result;
       }
}