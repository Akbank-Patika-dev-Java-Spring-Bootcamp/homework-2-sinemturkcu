package com.sinemturkcu.onlineshoppingsite.controller.contract;

import com.sinemturkcu.onlineshoppingsite.dto.request.ProductPriceUpdateRequest;
import com.sinemturkcu.onlineshoppingsite.dto.request.ProductSaveRequest;
import com.sinemturkcu.onlineshoppingsite.dto.response.ProductDto;

import java.util.List;

public interface ProductControllerContract {
    ProductDto save(ProductSaveRequest productSaveRequest);
    List<ProductDto> findAll();
    ProductDto findById(Long id);
    void delete(Long id);
    ProductDto updatePriceById(Long id, ProductPriceUpdateRequest productPriceUpdateRequest);




}
