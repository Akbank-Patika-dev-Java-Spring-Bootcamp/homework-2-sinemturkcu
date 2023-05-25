package com.sinemturkcu.onlineshoppingsite.mapper;

import com.sinemturkcu.onlineshoppingsite.dto.request.CommentSaveRequest;
import com.sinemturkcu.onlineshoppingsite.dto.response.CommentDto;
import com.sinemturkcu.onlineshoppingsite.entity.Comment;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CommentMapper {
    CommentMapper INSTANCE = Mappers.getMapper(CommentMapper.class);

    Comment convertToComment(CommentSaveRequest commentSaveRequest);
    CommentDto convertToCommentDTO(Comment comment);


}
