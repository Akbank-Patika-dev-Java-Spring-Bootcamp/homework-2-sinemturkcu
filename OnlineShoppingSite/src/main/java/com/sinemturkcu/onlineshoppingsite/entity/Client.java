package com.sinemturkcu.onlineshoppingsite.entity;

import com.sinemturkcu.onlineshoppingsite.General.BaseEntity;
import com.sinemturkcu.onlineshoppingsite.enums.EnumClientType;
import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Table(name = "Client")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Client extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Fullname" , length = 100 , nullable = false)
    private String fullName;


    @Column(name = "Email" , length = 50 , nullable = false)
    private String email;

    @Column(name = "PhoneNumber", nullable = false)
    private String phoneNumber;

    private EnumClientType enumClientType;


}
