/**
 * @author	: Murugan_Nagarajan
 * @date	: Sep 12, 2015
 * @time	: 6:02:03 PM
 */
package com.tamil.learnspring.loggers;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.tamil.learnspring.loggerinf.DBLoggerInf;
import com.tamil.learnspring.loggerinf.LoggerInf;

/**
 * @author Murugan_Nagarajan
 *
 */
@Component("dbLoggerToMySQL")
public class MySQLDBLogger implements LoggerInf, DBLoggerInf {
	
	
	private String dbSchema;
	private String dbUserName;
	
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
		System.out.println("DataSource needs to be created in Init method to schema: "+ dbSchema +" for userName: "+dbUserName);		
	}
	
	@PreDestroy
	public void destoryDBMtd() {
		System.out.println("Destroy MySQL DB Method annotation is @PreDestory");
	}

	/**
	 * @param dbSchema the dbSchema to set
	 */
	@Autowired
	public void setDbSchema(@Value("local_mysql_db") String dbSchema) {
		this.dbSchema = dbSchema;
	}

	/**
	 * @param userName the userName to set
	 */
	@Autowired
	public void setDbUserName(@Value("murugan") String dbUserName) {
		this.dbUserName = dbUserName;
	}	
}
