package mavenjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LearningJDBC {

	public static final Logger LOGGER = LogManager.getLogger(LearningJDBC.class);
	  
    private String jdbcConnectionURL;
    private String username;
    private String password;

    public LearningJDBC(String username, String password) {
        jdbcConnectionURL = "jdbc:mysql://localhost:3306/world";
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
            System.out.println("Connection successful");
            
        } catch (SQLException e) {
            LOGGER.debug(e.getStackTrace());
        } finally {
            try {
                if(conn != null) {
                    conn.close();
                    System.out.println("Connection Close");
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
    
    
    // create 
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
    
    
    // READ
    public City cityFromResultSet(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("id");
        String cityName = resultSet.getString("Name");
        String countryCode = resultSet.getString("CountryCode");
        String district = resultSet.getString("District");
        long population = resultSet.getLong("Population");
        return new City(id, cityName, countryCode, district, population);
    }

    public City readCity(int id) {
        try(Connection conn = DriverManager.getConnection(jdbcConnectionURL, username, password);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM customers WHERE id = " + id)) {

            resultSet.next();
            return cityFromResultSet(resultSet);
        } catch (SQLException e) {
            LOGGER.debug(e.getStackTrace());
        }
        return null;
    }
    
}
	
	

