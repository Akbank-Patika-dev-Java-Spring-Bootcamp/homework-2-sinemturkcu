package com.sinemturkcu.onlineshoppingsite.dto.request;

import com.sinemturkcu.onlineshoppingsite.enums.EnumClientType;

public record ClientSaveRequest(
        String fullName,
        String email,
        String phoneNumber,
        EnumClientType enumClientType) {
}
