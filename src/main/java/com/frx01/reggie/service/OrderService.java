package com.frx01.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.frx01.reggie.entity.Orders;

public interface OrderService extends IService<Orders> {


    /**
     * 用户下单
     * @param orders
     */
    public void submit(Orders orders);
}
