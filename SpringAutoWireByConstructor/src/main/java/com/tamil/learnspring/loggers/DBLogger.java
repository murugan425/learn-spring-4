/**
 * @author	: Murugan_Nagarajan
 * @date	: Sep 12, 2015
 * @time	: 6:02:03 PM
 */
package com.tamil.learnspring.loggers;

import com.tamil.learnspring.loggerinf.LoggerInf;

/**
 * @author Murugan_Nagarajan
 *
 */
public class DBLogger implements LoggerInf {

	public void write(String logText) {
		System.out.println("Write Log to DB :: "+logText);
	}

}
