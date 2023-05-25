package com.sinemturkcu.onlineshoppingsite.mapper;

import com.sinemturkcu.onlineshoppingsite.dto.request.ProductSaveRequest;
import com.sinemturkcu.onlineshoppingsite.dto.response.ProductDto;
import com.sinemturkcu.onlineshoppingsite.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
    Product convertToProduct(ProductSaveRequest productSaveRequest);
    ProductDto convertToProductDto(Product product);
    List<ProductDto> convertToProductDtoList(List<Product> products);

}
