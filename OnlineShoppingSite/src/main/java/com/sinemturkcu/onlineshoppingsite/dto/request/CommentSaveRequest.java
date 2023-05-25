package com.sinemturkcu.onlineshoppingsite.dto.request;

public record CommentSaveRequest(String comment, Long productId, Long clientId) {
}
