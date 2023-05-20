package com.sinemturkcu.onlineshoppingsite.dto;


import com.sinemturkcu.onlineshoppingsite.enums.EnumClientType;

public record ClientDto(String fullName,
                        String email,
                        String phoneNumber,
                        EnumClientType enumClientType) {
}
