package com.chien.springbootmall.dao;

import com.chien.springbootmall.dto.ProductRequest;
import com.chien.springbootmall.model.Product;
import org.springframework.stereotype.Component;


public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
