package com.fabriciosaand.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fabriciosaand.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>{
    
}
