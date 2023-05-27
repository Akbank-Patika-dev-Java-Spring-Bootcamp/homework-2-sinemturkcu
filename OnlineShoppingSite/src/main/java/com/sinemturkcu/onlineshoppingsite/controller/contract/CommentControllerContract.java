package com.sinemturkcu.onlineshoppingsite.controller.contract;

import com.sinemturkcu.onlineshoppingsite.dto.request.CommentSaveRequest;
import com.sinemturkcu.onlineshoppingsite.dto.response.CommentDto;
import java.util.List;

public interface CommentControllerContract {
     CommentDto save(CommentSaveRequest commentSaveRequest);
     List<CommentDto> getAll();
     CommentDto getById(Long id);
     List<CommentDto> getByClientComments(Long id);
     List<CommentDto> getCommentsByProductId(Long id);
     void delete(Long id);
}
