package com.chien.springbootmall.dao;

import com.chien.springbootmall.model.Product;
import org.springframework.stereotype.Component;


public interface ProductDao {

    Product getProductById(Integer productId);
}
