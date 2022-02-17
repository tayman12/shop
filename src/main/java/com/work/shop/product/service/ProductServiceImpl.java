package com.work.shop.product.service;

import com.work.shop.product.domain.Product;
import com.work.shop.product.repo.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;

    public Product create(Product product) {
        return productRepo.insert(product);
    }

    public List<Product> listAll() {
        return productRepo.findAll();
    }
}
