package com.work.shop.product.domain;

import com.work.shop.domain.BaseEntity;
import lombok.Data;

@Data
public class Product extends BaseEntity {

    private String name;

    private String description;

    private double price;

    private boolean popular;

    private boolean archived;
}
