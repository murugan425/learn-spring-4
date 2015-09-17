/**
 * @author	: Murugan_Nagarajan
 * @date	: Sep 12, 2015
 * @time	: 6:01:49 PM
 */
package com.tamil.learnspring.loggers;

import com.tamil.learnspring.loggerinf.LoggerInf;
/**
 * @author Murugan_Nagarajan
 *
 */
public class ConsoleLogger implements LoggerInf {

	public void write(String logText) {
		System.out.println("Write Log to Console :: "+logText);
	}

}
