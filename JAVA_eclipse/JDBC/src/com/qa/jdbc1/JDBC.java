package com.qa.jdbc1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.log4j.Logger;


public class JDBC {

	public static void main(String[] args) {
		
		    public static final Logger LOGGER = Logger.getLogger(LearningJDBC.class);

		    private String jdbcConnectionURL;
		    private String username;
		    private String password;

		    public LearningJDBC(String username, String password) {
		        jdbcConnectionURL = "jdbc:mysql://localhost:3306/ims";
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
		}
	}
}
