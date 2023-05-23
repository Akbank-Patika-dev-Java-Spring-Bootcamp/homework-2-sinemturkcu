package com.sinemturkcu.onlineshoppingsite.service;

import com.sinemturkcu.onlineshoppingsite.General.BaseEntityService;
import com.sinemturkcu.onlineshoppingsite.dao.ProductRepository;
import com.sinemturkcu.onlineshoppingsite.entity.Product;

public class ProductService extends BaseEntityService<Product,ProductRepository> {
    public ProductService(ProductRepository repository) {
        super(repository);
    }
}
