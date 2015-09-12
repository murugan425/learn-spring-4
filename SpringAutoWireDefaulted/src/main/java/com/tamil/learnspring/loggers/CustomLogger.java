/**
 * @author	: Murugan_Nagarajan
 * @date	: Sep 12, 2015
 * @time	: 7:10:28 PM
 */
package com.tamil.learnspring.loggers;

/**
 * @author Murugan_Nagarajan
 *
 */
public class CustomLogger {

	private ConsoleLogger consoleLogger;
	private DBLogger dbLogger;
	private FileLogger fileLogger;
	/**
	 * @param consoleLogger the consoleLogger to set
	 */
	public void setConsoleLogger(ConsoleLogger consoleLogger) {
		this.consoleLogger = consoleLogger;
	}
	/**
	 * @param dbLogger the dbLogger to set
	 */
	public void setDbLogger(DBLogger dbLogger) {
		this.dbLogger = dbLogger;
	}
	/**
	 * @param fileLogger the fileLogger to set
	 */
	public void setFileLogger(FileLogger fileLogger) {
		this.fileLogger = fileLogger;
	}
	
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
