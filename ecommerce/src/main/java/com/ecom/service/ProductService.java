package com.ecom.service;

import com.ecom.entity.Product;
import com.ecom.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product saveProduct(Product product) {
        Product productSaved = productRepository.save(product);
        return productSaved;
    }

    public Product getById(long id) {
        return productRepository.getById(id);
    }

}
