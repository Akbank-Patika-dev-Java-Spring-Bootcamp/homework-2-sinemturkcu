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

    @Column(name = "Comment")
    private String comment;

    @Column(name = "Client_id")
    private Long clientId;

    @Column(name = "Product_id")
    private Long productId;


}
