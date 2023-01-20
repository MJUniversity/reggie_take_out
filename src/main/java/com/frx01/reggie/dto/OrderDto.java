package com.frx01.reggie.dto;

import com.frx01.reggie.entity.OrderDetail;
import com.frx01.reggie.entity.Orders;
import lombok.Data;

import java.util.List;


@Data
public class OrderDto extends Orders {

    private List<OrderDetail> orderDetails;
}
