package com.ps.workingWith_product;

import com.ps.workingWith_product.controllers.ProductController;

import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WorkingWithProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkingWithProductApplication.class, args);

        // Download spring app from initialr
        // Make sure our dependencies are setup correctly
        // Create necessary packages
        // Setup database, provided db settings to application.properties
        // Create the config file to gain access to the data source

        // Creating our product controller file
        // Create a DAO for product interface/implementation

        // Add a single endpoint GET /products in the controller file
        // Add the getAll method the DAO
        // Test it/See all products from northwind

        // Add the rest of the CRUD endpoints

    }

    @Bean
    public ToolCallbackProvider tools(ProductController productController) {
      return MethodToolCallbackProvider.builder()
        .toolObjects(productController)
        .build();
    }

}
