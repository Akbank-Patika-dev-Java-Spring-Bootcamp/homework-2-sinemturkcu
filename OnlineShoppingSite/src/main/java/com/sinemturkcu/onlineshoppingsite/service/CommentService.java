package com.sinemturkcu.onlineshoppingsite.service;

import com.sinemturkcu.onlineshoppingsite.General.BaseEntityService;
import com.sinemturkcu.onlineshoppingsite.dao.CommentRepository;
import com.sinemturkcu.onlineshoppingsite.entity.Comment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService extends BaseEntityService<Comment, CommentRepository> {

    CommentRepository commentRepository;

    public CommentService(CommentRepository repository) {
        super(repository);
        this.commentRepository = repository;
    }

    public List<Comment> getCommentsByClientId(Long id){
        return commentRepository.getCommentsByClientId(id);
    }

    public List<Comment> getCommentsByProductId(Long id){
        return commentRepository.getCommentsByProductId(id);
    }

}
