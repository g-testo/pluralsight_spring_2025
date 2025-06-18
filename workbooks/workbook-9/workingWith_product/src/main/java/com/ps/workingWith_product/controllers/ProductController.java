package com.ps.workingWith_product.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {


    @GetMapping("/products")
    public String getAllProducts(){
        return "Test";
    }
}
