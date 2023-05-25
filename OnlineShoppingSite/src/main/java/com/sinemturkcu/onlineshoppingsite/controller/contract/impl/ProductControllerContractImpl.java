package com.sinemturkcu.onlineshoppingsite.controller.contract.impl;

import com.sinemturkcu.onlineshoppingsite.controller.contract.ProductControllerContract;
import com.sinemturkcu.onlineshoppingsite.dto.request.ProductSaveRequest;
import com.sinemturkcu.onlineshoppingsite.dto.response.ProductDto;
import com.sinemturkcu.onlineshoppingsite.entity.Product;
import com.sinemturkcu.onlineshoppingsite.mapper.ProductMapper;
import com.sinemturkcu.onlineshoppingsite.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
 class ProductControllerContractImpl implements ProductControllerContract {

    private final ProductService productService;

    @Override
    public ProductDto save(ProductSaveRequest productSaveRequest) {
        Product product = ProductMapper.INSTANCE.convertToProduct(productSaveRequest);
        product= productService.save(product);
        return ProductMapper.INSTANCE.convertToProductDto(product);
    }

    @Override
    public List<ProductDto> findAll() {
        return ProductMapper.INSTANCE.convertToProductDtoList(productService.getAll());
    }

    @Override
    public ProductDto findById(Long id) {
        Product product = productService.getById(id);
        return ProductMapper.INSTANCE.convertToProductDto(product);
    }

}
