package com.nk.productcatalog.service;

import com.nk.productcatalog.model.Category;
import com.nk.productcatalog.model.Product;
import com.nk.productcatalog.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public List<Product> getProductsByCategory(Long categoryId){
        return productRepository.findByCategoryId(categoryId);
    }

}
