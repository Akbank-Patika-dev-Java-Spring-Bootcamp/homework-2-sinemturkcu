package com.sinemturkcu.onlineshoppingsite.errormessages;

import com.sinemturkcu.onlineshoppingsite.General.BaseErrorMessage;

public enum CommentErrorMessages implements BaseErrorMessage {
    COMMENT_NOT_FOUND("Comment not found!");

    private String message;

    CommentErrorMessages(String message) {
        this.message=message;
    }


    @Override
    public String getMessage() {
        return message;
    }
}
