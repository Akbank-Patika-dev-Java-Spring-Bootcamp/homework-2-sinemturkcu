package com.sinemturkcu.onlineshoppingsite.controller;

import com.sinemturkcu.onlineshoppingsite.controller.contract.ProductControllerContract;
import com.sinemturkcu.onlineshoppingsite.dto.request.ProductSaveRequest;
import com.sinemturkcu.onlineshoppingsite.dto.response.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductControllerContract productControllerContract;

    @PostMapping
    public ResponseEntity<ProductDto> save(@RequestBody ProductSaveRequest productSaveRequest){
        var response = productControllerContract.save(productSaveRequest);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<List<ProductDto>> getAll(){
      var response = productControllerContract.findAll();
      return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> getById(@PathVariable Long id){
        var response = productControllerContract.findById(id);
        return ResponseEntity.ok(response);
    }




}
