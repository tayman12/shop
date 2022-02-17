package com.work.shop.product.controller;

import com.work.shop.product.domain.Product;
import com.work.shop.product.dto.ProductCreationRequestDto;
import com.work.shop.product.dto.ProductDto;
import com.work.shop.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ModelMapper modelMapper;
    private final ProductService productService;

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ProductDto create(@RequestBody @Validated ProductCreationRequestDto productCreationRequestDto) {
        Product product = convertToEntity(productCreationRequestDto);
        Product createdProduct = productService.create(product);

        System.out.println(createdProduct);

        return convertToDto(createdProduct);
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<ProductDto> listAll() {
        return productService.listAll().stream().map(this::convertToDto).collect(Collectors.toList());
    }

    private Product convertToEntity(ProductCreationRequestDto productCreationRequestDto) {
        return modelMapper.map(productCreationRequestDto, Product.class);
    }

    private ProductDto convertToDto(Product product) {
        return modelMapper.map(product, ProductDto.class);
    }
}
