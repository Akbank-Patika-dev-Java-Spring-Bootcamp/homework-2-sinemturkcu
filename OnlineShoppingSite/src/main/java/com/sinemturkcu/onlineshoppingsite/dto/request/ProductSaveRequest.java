package com.sinemturkcu.onlineshoppingsite.dto.request;

import com.sinemturkcu.onlineshoppingsite.enums.EnumProductCategory;

public record ProductSaveRequest(
        String productName,
        double productPrice,
        EnumProductCategory productCategory,
        int productStock,
        String productDescription,
        String productImageUrl
) {
}

