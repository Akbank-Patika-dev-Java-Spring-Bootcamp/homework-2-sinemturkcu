package com.sinemturkcu.onlineshoppingsite.controller.contract.impl;

import com.sinemturkcu.onlineshoppingsite.controller.contract.CommentControllerContract;
import com.sinemturkcu.onlineshoppingsite.dto.request.CommentSaveRequest;
import com.sinemturkcu.onlineshoppingsite.dto.response.CommentDto;
import com.sinemturkcu.onlineshoppingsite.entity.Comment;
import com.sinemturkcu.onlineshoppingsite.mapper.CommentMapper;
import com.sinemturkcu.onlineshoppingsite.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentControllerContractImpl implements CommentControllerContract {

    private final CommentService commentService;

    @Override
    public CommentDto save(CommentSaveRequest commentSaveRequest) {
        Comment comment = CommentMapper.INSTANCE.convertToComment(commentSaveRequest);
        commentService.save(comment);
        return CommentMapper.INSTANCE.convertToCommentDTO(comment);
    }
}
