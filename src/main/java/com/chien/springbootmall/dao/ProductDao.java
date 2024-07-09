package com.chien.springbootmall.dao;

import com.chien.springbootmall.constant.ProductCategory;
import com.chien.springbootmall.dto.ProductQueryParams;
import com.chien.springbootmall.dto.ProductRequest;
import com.chien.springbootmall.model.Product;
import org.springframework.stereotype.Component;

import java.util.List;


public interface ProductDao {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Integer countProduct(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
