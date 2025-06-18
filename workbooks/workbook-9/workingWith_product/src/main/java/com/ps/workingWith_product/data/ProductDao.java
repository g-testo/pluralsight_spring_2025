package com.ps.workingWith_product.data;

import com.ps.workingWith_product.models.Product;

import java.util.List;

public interface ProductDao {
    public List<Product> getAll();
    public Product getById(int id);
    public Product create(Product product);
    public void update(int id, Product product);
    public void delete(int id);
}
