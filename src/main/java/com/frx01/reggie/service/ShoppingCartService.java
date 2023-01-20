package com.frx01.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.frx01.reggie.entity.ShoppingCart;

public interface ShoppingCartService extends IService<ShoppingCart> {
    void clean();
}
