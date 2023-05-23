package com.sinemturkcu.onlineshoppingsite.entity;

import com.sinemturkcu.onlineshoppingsite.General.BaseEntity;
import com.sinemturkcu.onlineshoppingsite.enums.EnumProductCategory;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Table(name="Product")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product extends BaseEntity {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "Name", nullable = false)
    private String productName;

    @NonNull
    @Column(name = "Price" , nullable = false)
    private double productPrice;

    @Column(name = "Category")
    private EnumProductCategory productCategory;

    @Column(name = "Stock" , nullable = false)
    private int productStock;

    @Column(name = "Description")
    private String productDescription;

    @Column(name = "ProductImageUrl")
    private String productImageUrl;

    @Override
    public Long getId() {
        return null;
    }
}
