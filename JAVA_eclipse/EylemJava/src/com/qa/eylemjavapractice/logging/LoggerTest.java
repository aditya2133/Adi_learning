package com.qa.eylemjavapractice.logging;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import java.util.logging.Logger;
import java.util.logging.LogManager;

public class LoggerTest {

	public static void main(String[] args) {
	
//	public static Logger LOGGER = LogManager.getLogger();
	// LogManager is a holder for multiple different loggers!
	
	Logger LOGGER = Logger.getLogger(null);
	
//	private String message = "This is some message"; 
	
//public void logMessage(String message) {
//	LOGGER.info(message);
//}
//	
	}
}
