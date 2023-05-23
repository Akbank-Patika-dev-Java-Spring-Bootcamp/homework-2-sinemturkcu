package com.sinemturkcu.onlineshoppingsite.dto.response;

import com.sinemturkcu.onlineshoppingsite.enums.EnumProductCategory;

public record ProductDto(
        Long id,
        String productName,
        double productPrice,
        EnumProductCategory productCategory,
        int productStock,
        String productDescription,
        String productImageUrl
) {
}
