package com.ecom.controller;

import com.ecom.entity.Product;
import com.ecom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1.0/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping
    public ResponseEntity create(@RequestBody Product product) {
        Product subject1 = productService.saveProduct(product);
        return new ResponseEntity(subject1, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity update(@RequestBody Product product) {
        Product subject1 = productService.saveProduct(product);
        return new ResponseEntity(subject1, HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity getAllSubjects() {
        List<Product> subjectList = productService.getAllProducts();
        return new ResponseEntity(subjectList, HttpStatus.OK);
    }

    @GetMapping("/list/id")
    public ResponseEntity getById(@RequestParam long id) {
        Product subject = productService.getById(id);
        return new ResponseEntity(subject, HttpStatus.OK);
    }

}
