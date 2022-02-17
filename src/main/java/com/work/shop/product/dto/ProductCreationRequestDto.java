package com.work.shop.product.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

@Data
public class ProductCreationRequestDto {

    @NotBlank
    private String name;

    private String description;

    @Positive
    private double price;

    private boolean popular;

}
