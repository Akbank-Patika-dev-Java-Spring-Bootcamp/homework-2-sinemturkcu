package com.sinemturkcu.onlineshoppingsite.entity;

import com.sinemturkcu.onlineshoppingsite.General.BaseEntity;
import com.sinemturkcu.onlineshoppingsite.enums.EnumProductCategory;
import jakarta.persistence.*;
import lombok.*;

@Table(name="Product")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Name", nullable = false)
    private String productName;

    @NonNull
    @Column(name = "Price" , nullable = false)
    private double productPrice;

    @Column(name = "Category")
    private EnumProductCategory productCategory;

    @Column(name = "Stock" )
    private int productStock;

    @Column(name = "Description")
    private String productDescription;

    @Column(name = "ProductImageUrl")
    private String productImageUrl;

}
