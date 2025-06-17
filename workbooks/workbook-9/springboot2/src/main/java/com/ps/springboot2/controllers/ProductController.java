package com.ps.springboot2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    // Index/Home endpoint
    @GetMapping("/") // http://localhost:8080
    public String root(@RequestParam(required = false) String name){
        return "Hello " + name;
    }

    // Get all endpoint
    @GetMapping("/products")
    public String getAllProducts(){
        return "Products";
    }

}
