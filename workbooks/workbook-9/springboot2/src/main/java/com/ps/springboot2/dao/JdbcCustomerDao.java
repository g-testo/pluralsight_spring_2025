package com.ps.springboot2.dao;

import com.ps.springboot2.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcCustomerDao implements CustomerDao{
    private DataSource dataSource;
    @Autowired
    public JdbcCustomerDao(DataSource dataSource){
        this.dataSource = dataSource;
    }
    @Override
    public List<Customer> getAll(){
        List<Customer> customers = new ArrayList<>();
        String sql = "SELECT * FROM Customers;";
        try(Connection connection = dataSource.getConnection()){
            Statement statement = connection.createStatement();
            ResultSet rows = statement.executeQuery(sql);
            while(rows.next()){
                Customer customer = new Customer();
                customer.setId(rows.getString("CustomerID"));
                customer.setName(rows.getString("CompanyName"));
                customer.setAddress(rows.getString("Address"));
                customers.add(customer);
            }
        }
        catch (SQLException e){ System.out.println(e); }
        return customers;
    }
}