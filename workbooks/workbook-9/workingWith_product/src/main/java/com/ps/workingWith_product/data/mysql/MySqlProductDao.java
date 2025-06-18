package com.ps.workingWith_product.data.mysql;

import com.ps.workingWith_product.data.ProductDao;
import com.ps.workingWith_product.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class MySqlProductDao implements ProductDao {
    private DataSource dataSource;

    @Autowired
    public MySqlProductDao(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public List<Product> getAll(){
        // Set an empty an array
        List<Product> products = new ArrayList<>();

        // Define our query
        String query = "SELECT * FROM products;";

        try(
            // Create connections
            Connection connection = dataSource.getConnection();
            // Create PreparedStatement
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            // Create a result set
            ResultSet resultSet = preparedStatement.executeQuery();
        ){
            // Loop through the resultset
            if(resultSet.next()){
                do{
                    Product product = parseProduct(resultSet);
                    // Add record to array
                    products.add(product);
                } while(resultSet.next());
            } else {
                System.out.println("No products found");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }

        // Return the array
        return products;
    }

    public Product getById(int id){
        // Query
        String query = "SELECT * FROM products WHERE ProductId=?;";

        try(
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
        ){
            preparedStatement.setInt(1, id);
            try(
                ResultSet resultSet = preparedStatement.executeQuery();
            ){
                if(resultSet.next()){
                    return parseProduct(resultSet);
                } else {
                    System.out.println("No product found with that id");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public Product create(Product product){
        // query
        String query = "INSERT INTO products(ProductName, UnitPrice) VALUES (?,?)";

        try(
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);

        )
    }


    public Product parseProduct(ResultSet resultSet) throws SQLException {
        int productId = resultSet.getInt("ProductId");
        String productName = resultSet.getString("ProductName");
        double unitPrice = resultSet.getDouble("UnitPrice");
        return new Product(productId, productName, unitPrice);
    }

}
