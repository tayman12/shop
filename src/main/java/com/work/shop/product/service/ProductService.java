package com.work.shop.product.service;

import com.work.shop.product.domain.Product;

import java.util.List;

public interface ProductService {

    Product create(Product product);

    List<Product> listAll();
}
