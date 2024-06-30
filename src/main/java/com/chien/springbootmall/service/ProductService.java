package com.chien.springbootmall.service;

import com.chien.springbootmall.dto.ProductRequest;
import com.chien.springbootmall.model.Product;


public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
