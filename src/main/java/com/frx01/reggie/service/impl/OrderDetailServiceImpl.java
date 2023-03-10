package com.frx01.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.frx01.reggie.entity.OrderDetail;
import com.frx01.reggie.mapper.OrderDetailMapper;
import com.frx01.reggie.service.OrderDetailService;
import com.frx01.reggie.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService{
}
