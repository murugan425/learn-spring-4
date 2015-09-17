/**
 * @author	: Murugan_Nagarajan
 * @date	: Sep 13, 2015
 * @time	: 11:13:32 AM
 */
package com.tamil.learnspring.loggerinf;

import org.springframework.stereotype.Component;

/**
 * @author Murugan_Nagarajan
 *
 */
@Component
public interface DBLoggerInf {
	public void writeLogToDB(String log);
}
