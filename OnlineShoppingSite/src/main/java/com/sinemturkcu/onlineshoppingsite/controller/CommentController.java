package com.sinemturkcu.onlineshoppingsite.controller;

import com.sinemturkcu.onlineshoppingsite.controller.contract.CommentControllerContract;
import com.sinemturkcu.onlineshoppingsite.dto.request.CommentSaveRequest;
import com.sinemturkcu.onlineshoppingsite.dto.response.CommentDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public ResponseEntity<List<CommentDto>> getAll(){
        var response = commentControllerContract.getAll();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CommentDto> getById(@PathVariable Long id){
        var response = commentControllerContract.getById(id);
        return ResponseEntity.ok(response);
    }
    @GetMapping("/client")
    public ResponseEntity<List<CommentDto>> getByClientComments(@RequestParam Long clientId) {
        var response = commentControllerContract.getByClientComments(clientId);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/product")
    public ResponseEntity<List<CommentDto>> getCommentsByProductId(@RequestParam Long productId) {
        var response = commentControllerContract.getCommentsByProductId(productId);
        return ResponseEntity.ok(response);
    }

}
