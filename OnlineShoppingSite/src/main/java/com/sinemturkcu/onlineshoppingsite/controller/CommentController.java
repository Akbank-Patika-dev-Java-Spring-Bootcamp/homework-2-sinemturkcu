package com.sinemturkcu.onlineshoppingsite.controller;

import com.sinemturkcu.onlineshoppingsite.controller.contract.CommentControllerContract;
import com.sinemturkcu.onlineshoppingsite.dto.request.CommentSaveRequest;
import com.sinemturkcu.onlineshoppingsite.dto.response.CommentDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/comments")
@RequiredArgsConstructor
public class CommentController {

    private final CommentControllerContract commentControllerContract;

    @PostMapping
    public ResponseEntity<CommentDto> save(@RequestBody CommentSaveRequest commentSaveRequest){
        var response = commentControllerContract.save(commentSaveRequest);
        return ResponseEntity.ok(response);
    }

}
