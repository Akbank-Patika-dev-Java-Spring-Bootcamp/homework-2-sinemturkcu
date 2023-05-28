package com.sinemturkcu.onlineshoppingsite.errormessages;

public class CommentNotFoundException extends RuntimeException{
    public CommentNotFoundException(String message) {
        super(message);
    }
}
