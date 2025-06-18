package com.ps.workingWith_product.controllers;

import com.ps.workingWith_product.data.ProductDao;
import com.ps.workingWith_product.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private ProductDao productDao;

    @Autowired
    public ProductController(ProductDao  productDao){
        this.productDao = productDao;
    }


    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productDao.getAll();
    }
}
