package com.sinemturkcu.onlineshoppingsite.dao;

import com.sinemturkcu.onlineshoppingsite.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
