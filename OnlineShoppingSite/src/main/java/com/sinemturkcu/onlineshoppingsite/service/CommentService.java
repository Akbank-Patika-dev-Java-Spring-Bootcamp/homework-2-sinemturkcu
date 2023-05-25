package com.sinemturkcu.onlineshoppingsite.service;

import com.sinemturkcu.onlineshoppingsite.General.BaseEntityService;
import com.sinemturkcu.onlineshoppingsite.dao.CommentRepository;
import com.sinemturkcu.onlineshoppingsite.entity.Comment;
import org.springframework.stereotype.Service;

@Service
public class CommentService extends BaseEntityService<Comment, CommentRepository> {
    public CommentService(CommentRepository repository) {
        super(repository);
    }

}
