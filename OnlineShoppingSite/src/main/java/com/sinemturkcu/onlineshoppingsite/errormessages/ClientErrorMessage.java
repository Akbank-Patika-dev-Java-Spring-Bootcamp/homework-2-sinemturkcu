package com.sinemturkcu.onlineshoppingsite.errormessages;

import com.sinemturkcu.onlineshoppingsite.General.BaseErrorMessage;

public enum ClientErrorMessage implements BaseErrorMessage {

    CLIENT_NOT_FOUND("Client not found!");

    private String message;

    ClientErrorMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
