/**
 * @author	: Murugan_Nagarajan
 * @date	: Sep 12, 2015
 * @time	: 7:10:28 PM
 */
package com.tamil.learnspring.loggers;

import javax.annotation.Resource;

import com.tamil.learnspring.loggerinf.DBLoggerInf;
//import com.tamil.learnspring.loggerinf.FileLoggerInf;
import com.tamil.learnspring.loggerinf.LoggerInf;

/**
 * @author Murugan_Nagarajan
 *
 */
public class CustomLogger {
	
	@Resource
	private ConsoleLogger consoleLogger;
	
	@Resource
	private DBLogger dbLogger;
	
	@Resource(name="dbMySQLLogger")
	private DBLoggerInf dbLoggerToMySQL;
	
	@Resource(name="dbOracleLogger")
	private DBLoggerInf dbLoggerToOracle;
	
	@Resource
	private LoggerInf fileLogger;
	
	@Resource
	private LoggerInf pdfFileLogger;
	/**
	 * @param dbLogger
	 * @param fileLogger
	 */
	/*@Autowired
	public CustomLogger(DBLogger dbLogger, FileLogger fileLogger) {
		super();
		this.dbLogger = dbLogger;
		this.fileLogger = fileLogger;
	}*/
	
	//The annotation can be written in the Setter method also if needed.
	//but, setter is not mandatory for auto wired annotations.,
	
	
	/**
	 * @param consoleLogger the consoleLogger to set
	 */
	/*@Autowired
	public void setConsoleLogger(ConsoleLogger consoleLogger) {
		this.consoleLogger = consoleLogger;
	}*/

	/**
	 * @param dbLogger the dbLogger to set
	 */
	/*@Autowired
	public void setDbLogger(DBLogger dbLogger) {
		this.dbLogger = dbLogger;
	}*/

	/**
	 * @param fileLogger the fileLogger to set
	 */
	/*@Autowired
	public void setFileLogger(FileLogger fileLogger) {
		this.fileLogger = fileLogger;
	}*/

	public void writeLogToFile(String log) {
		//Log to simple txt file
		fileLogger.write(log);
		//Log to a pdf file for analysis
		pdfFileLogger.write(log);
	}

	public void writeLogToConsole(String log) {
		if(consoleLogger != null) {
			consoleLogger.write(log);
		}
	}
	
	public void writeLogToDB(String log) {
		//Log using the simple primary DB
		dbLogger.write(log);
		//Log using the MYQSQL DB
		dbLoggerToMySQL.writeLogToDB(log);
		//Log using the ORACLE DB
		dbLoggerToOracle.writeLogToDB(log);
	}
}
