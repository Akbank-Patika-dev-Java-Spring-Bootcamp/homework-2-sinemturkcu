package com.sinemturkcu.onlineshoppingsite.dao;

import com.sinemturkcu.onlineshoppingsite.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
