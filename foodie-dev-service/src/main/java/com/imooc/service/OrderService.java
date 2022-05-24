package com.imooc.service;

import com.imooc.pojo.Carousel;
import com.imooc.pojo.bo.SubmitOrderBO;
import com.imooc.pojo.vo.OrderVO;

import java.util.List;

public interface OrderService {
    /**
     * 查询所有轮播图列表
     * @param isShow
     * @return
     */

    /**
     * 用于创建订单相关信息
     * @param submitOrderBO
     */
    public OrderVO createOrder(SubmitOrderBO submitOrderBO);

    public void updateOrderStatus(String orderId, Integer orderStatus);




}
