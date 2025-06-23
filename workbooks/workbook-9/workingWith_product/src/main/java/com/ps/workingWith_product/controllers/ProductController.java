package com.ps.workingWith_product.controllers;

import com.ps.workingWith_product.data.ProductDao;
import com.ps.workingWith_product.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.ai.tool.annotation.Tool;

@RestController
@RequestMapping("products")
@CrossOrigin("*")
public class ProductController {
    private ProductDao productDao;

    @Autowired
    public ProductController(ProductDao  productDao){
        this.productDao = productDao;
    }

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    @Tool(name = "listProducts", description = "List all products")
    public List<Product> getAllProducts(){
        return productDao.getAll();
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    @Tool(name = "getProductById", description = "Retrieve a product by its ID")
    public Product getProductById(@PathVariable int id){
        return productDao.getById(id);
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    @Tool(name = "createProduct", description = "Create a new product")
    public Product createProduct(@RequestBody Product product){
        return productDao.create(product);
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Tool(name = "updateProduct", description = "Update an existing product")
    public void updateProduct(@PathVariable int id, @RequestBody Product product){
        productDao.update(id, product);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Tool(name = "deleteProduct", description = "Delete a product")
    public void deleteProduct(@PathVariable int id){
        productDao.delete(id);
    }

}
