package com.frx01.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.frx01.reggie.entity.Category;
import com.frx01.reggie.entity.Employee;
import com.frx01.reggie.mapper.CategoryMapper;
import org.springframework.stereotype.Service;

public interface CategoryService extends IService<Category>  {

    public void remove(Long id);
}
