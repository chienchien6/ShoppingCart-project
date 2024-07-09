package com.chien.springbootmall.service;

import com.chien.springbootmall.constant.ProductCategory;
import com.chien.springbootmall.dto.ProductQueryParams;
import com.chien.springbootmall.dto.ProductRequest;
import com.chien.springbootmall.model.Product;

import java.util.List;


public interface ProductService {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Integer countProduct(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
