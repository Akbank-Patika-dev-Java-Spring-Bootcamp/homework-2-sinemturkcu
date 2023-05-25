package com.sinemturkcu.onlineshoppingsite.controller.contract;

import com.sinemturkcu.onlineshoppingsite.dto.request.CommentSaveRequest;
import com.sinemturkcu.onlineshoppingsite.dto.response.CommentDto;

public interface CommentControllerContract {
     CommentDto save(CommentSaveRequest commentSaveRequest);
}
