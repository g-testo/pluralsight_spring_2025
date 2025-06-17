package com.ps.springboot2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/") // http://localhost:8080
    public String root(){
        return "Hello World";
    }

    @GetMapping("/products")
    public String getAllProducts(){
        return "Products";
    }

}
