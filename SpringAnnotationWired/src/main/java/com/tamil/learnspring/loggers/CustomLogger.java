/**
 * @author	: Murugan_Nagarajan
 * @date	: Sep 12, 2015
 * @time	: 7:10:28 PM
 */
package com.tamil.learnspring.loggers;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Murugan_Nagarajan
 *
 */
public class CustomLogger {
	
	@Autowired
	private ConsoleLogger consoleLogger;
	
	private DBLogger dbLogger;
	
	private FileLogger fileLogger;
	
	/**
	 * @param dbLogger
	 * @param fileLogger
	 */
	@Autowired
	public CustomLogger(DBLogger dbLogger, FileLogger fileLogger) {
		super();
		this.dbLogger = dbLogger;
		this.fileLogger = fileLogger;
	}
	
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
		fileLogger.write(log);
	}

	public void writeLogToConsole(String log) {
		consoleLogger.write(log);
	}
	
	public void writeLogToDB(String log) {
		dbLogger.write(log);
	}
}
