package com.ps.springboot2.dao;

import com.ps.springboot2.models.Customer;

import java.util.List;

public interface CustomerDao {
    public List<Customer> getAll();
}
