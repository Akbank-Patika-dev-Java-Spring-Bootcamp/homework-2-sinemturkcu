package com.sinemturkcu.onlineshoppingsite.entity;

import com.sinemturkcu.onlineshoppingsite.General.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Comment")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Comment extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Comment",nullable = false)
    private String comment;

    @Column(name = "Client_id",nullable = false)
    private Long clientId;

    @Column(name = "Product_id", nullable = false)
    private Long productId;


}
