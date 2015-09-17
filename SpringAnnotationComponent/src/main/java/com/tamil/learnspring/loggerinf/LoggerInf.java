/**
 * @author	: Murugan_Nagarajan
 * @date	: Sep 12, 2015
 * @time	: 6:08:15 PM
 */
package com.tamil.learnspring.loggerinf;

import org.springframework.stereotype.Component;

/**
 * @author Murugan_Nagarajan
 *
 */
@Component
public interface LoggerInf {	
	public void write(String logText);
}
