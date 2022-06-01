package com.qa.maven;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class LearningJDBC {

    public static final Logger LOGGER = LogManager.getLogger(LearningJDBC.class);

    private String jdbcConnectionURL;
    private String username;
    private String password;

    public LearningJDBC(String username, String password) {
        jdbcConnectionURL = "jdbc:mysql://localhost:3306/movielens";
        this.username = username;
        this.password = password;
    }

    public LearningJDBC(String jdbcConnectionURL, String username, String password) {
        this.jdbcConnectionURL = jdbcConnectionURL;
        this.username = username;
        this.password = password;
    }

    public void readAll() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(jdbcConnectionURL, username, password);
        } catch (SQLException e) {
        	
            LOGGER.debug(e.getStackTrace());
        } finally {
            try {
                if(conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
    
    
    // CREATING
//    public void create(Customer customer) {
//        try(Connection conn = DriverManager.getConnection(jdbcConnectionURL, username, password);
//                Statement statement = conn.createStatement()) {
//
//            statement.executeUpdate("INSERT INTO customers(first_name, surname) VALUES('" +
//                customer.getFirstName() + "','" + customer.getSurname() + "')");
//        } catch (SQLException e) {
//            LOGGER.debug(e.getStackTrace());
//        }
//    }
    
    
    
    // READING 
//    public Customer customerFromResultSet(ResultSet resultSet) throws SQLException {
//        Long id = resultSet.getLong("id");
//        String firstName = resultSet.getString("first_name");
//        String surname = resultSet.getString("surname");
//        return new Customer(id, firstName, surname);
//    }
//
//    public Customer readCustomer(Long id) {
//        try(Connection conn = DriverManager.getConnection(jdbcConnectionURL, username, password);
//                Statement statement = conn.createStatement();
//                ResultSet resultSet = statement.executeQuery("SELECT FROM customers WHERE id = " + id)) {
//
//            resultSet.next();
//            return customerFromResultSet(resultSet);
//        } catch (SQLException e) {
//            LOGGER.debug(e.getStackTrace());
//        }
//        return null;
//    }
}