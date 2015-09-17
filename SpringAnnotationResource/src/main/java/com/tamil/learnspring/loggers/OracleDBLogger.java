/**
 * @author	: Murugan_Nagarajan
 * @date	: Sep 12, 2015
 * @time	: 6:02:03 PM
 */
package com.tamil.learnspring.loggers;

import com.tamil.learnspring.loggerinf.DBLoggerInf;
import com.tamil.learnspring.loggerinf.LoggerInf;

/**
 * @author Murugan_Nagarajan
 *
 */
public class OracleDBLogger implements LoggerInf, DBLoggerInf {

	
	public void write(String logText) {
		System.out.println("Write Log to Oracle DB :: "+logText);
	}

	/* (non-Javadoc)
	 * @see com.tamil.learnspring.loggerinf.DBLoggerInf#writeToDB(java.lang.String)
	 */
	public void writeLogToDB(String log) {
		this.write(log);
		
	}

}
