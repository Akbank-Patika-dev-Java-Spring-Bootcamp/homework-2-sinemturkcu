package com.sinemturkcu.onlineshoppingsite.General;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class GenericErrorMessage {

    private LocalDateTime errorDate;
    private String message;
    private String detail;
}
