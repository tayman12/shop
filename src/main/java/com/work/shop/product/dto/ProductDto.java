package com.work.shop.product.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import java.time.Instant;

@Data
public class ProductDto {

    private String id;

    @NotBlank
    private String name;

    private String description;

    @Positive
    private double price;

    private boolean popular;

    private boolean archived;

    private Instant createdAt;

    private Instant lastModifiedAt;
}
