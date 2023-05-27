package com.sinemturkcu.onlineshoppingsite.controller.contract.impl;

import com.sinemturkcu.onlineshoppingsite.controller.contract.CommentControllerContract;
import com.sinemturkcu.onlineshoppingsite.dto.request.CommentSaveRequest;
import com.sinemturkcu.onlineshoppingsite.dto.response.CommentDto;
import com.sinemturkcu.onlineshoppingsite.entity.Comment;
import com.sinemturkcu.onlineshoppingsite.errormessages.CommentErrorMessages;
import com.sinemturkcu.onlineshoppingsite.errormessages.CommentNotFoundException;
import com.sinemturkcu.onlineshoppingsite.mapper.CommentMapper;
import com.sinemturkcu.onlineshoppingsite.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

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

    @Override
    public List<CommentDto> getAll() {
        List<Comment> commentList = commentService.getAll();
        return CommentMapper.INSTANCE.converToCommentDTOList(commentList);
    }

    @Override
    public CommentDto getById(Long id) {
        Comment comment = commentService.getById(id);
        if (comment == null) {
            throw new CommentNotFoundException(CommentErrorMessages.COMMENT_NOT_FOUND.getMessage());
        }
        return CommentMapper.INSTANCE.convertToCommentDTO(comment);
    }

    @Override
    public List<CommentDto> getByClientComments(Long id) {
        List<Comment> commentList = commentService.getCommentsByClientId(id);
        return CommentMapper.INSTANCE.converToCommentDTOList(commentList);
    }

    @Override
    public List<CommentDto> getCommentsByProductId(Long id) {
        List<Comment> commentList = commentService.getCommentsByProductId(id);
        return CommentMapper.INSTANCE.converToCommentDTOList(commentList);
    }

    @Override
    public void delete(Long id) {
        Comment comment = commentService.getById(id);
        commentService.delete(comment);
    }
}
