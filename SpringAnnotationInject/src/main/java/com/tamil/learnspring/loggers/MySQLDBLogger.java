/**
 * @author	: Murugan_Nagarajan
 * @date	: Sep 12, 2015
 * @time	: 6:02:03 PM
 */
package com.tamil.learnspring.loggers;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import com.tamil.learnspring.loggerinf.DBLoggerInf;
import com.tamil.learnspring.loggerinf.LoggerInf;

/**
 * @author Murugan_Nagarajan
 *
 */
public class MySQLDBLogger implements LoggerInf, DBLoggerInf {

	public void write(String logText) {
		System.out.println("Write Log to MySQL DB :: "+logText);
	}

	/* (non-Javadoc)
	 * @see com.tamil.learnspring.loggerinf.DBLoggerInf#writeToDB(java.lang.String)
	 */
	public void writeLogToDB(String log) {
		this.write(log);		
	}
	
	@PostConstruct
	public void initializeDBMtd() {
		System.out.println("Initialize MySQL DB Method annotation is @PostConstruct");
	}
	
	@PreDestroy
	public void destoryDBMtd() {
		System.out.println("Destroy MySQL DB Method annotation is @PreDestory");
	}
}
