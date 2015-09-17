/**
 * @author	: Murugan_Nagarajan
 * @date	: Sep 12, 2015
 * @time	: 7:47:52 PM
 */
package com.tamil.learnspring.logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tamil.learnspring.loggers.CustomLogger;

/**
 * @author Murugan_Nagarajan
 *
 */
public class AppMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		CustomLogger logger = (CustomLogger)context.getBean("customLogger");
		logger.writeLogToConsole("errorMsg");
		logger.writeLogToDB("errorMsg");
		logger.writeLogToFile("errorMsg");
		((ClassPathXmlApplicationContext)context).close();

	}

}
