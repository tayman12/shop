package com.work.shop.product.repo;

import com.work.shop.product.domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepo extends MongoRepository<Product, String> {
}
