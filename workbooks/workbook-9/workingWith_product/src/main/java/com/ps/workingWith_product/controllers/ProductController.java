package com.ps.workingWith_product.controllers;

import com.ps.workingWith_product.data.ProductDao;
import com.ps.workingWith_product.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {
    private ProductDao productDao;

    @Autowired
    public ProductController(ProductDao  productDao){
        this.productDao = productDao;
    }


    @GetMapping("")
    public List<Product> getAllProducts(){
        return productDao.getAll();
    }

    @GetMapping("{id}")
    public Product getProductById(@PathVariable int id){
        return productDao.getById(id);
    }

    @PostMapping("")
    public Product createProduct(@RequestBody Product product){
        return productDao.create(product);
    }

}
