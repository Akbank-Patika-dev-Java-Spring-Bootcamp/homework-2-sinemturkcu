package com.sinemturkcu.onlineshoppingsite.dao;

import com.sinemturkcu.onlineshoppingsite.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Long> {
    List<Comment>  getCommentsByClientId(Long id);
    List<Comment> getCommentsByProductId(Long id);
}
