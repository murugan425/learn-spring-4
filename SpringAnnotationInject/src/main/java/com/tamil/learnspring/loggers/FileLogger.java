/**
 * @author	: Murugan_Nagarajan
 * @date	: Sep 12, 2015
 * @time	: 6:02:13 PM
 */
package com.tamil.learnspring.loggers;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Qualifier;

import com.tamil.learnspring.loggerinf.LoggerInf;

/**
 * @author Murugan_Nagarajan
 *
 */
@Qualifier("textfilelogger")
public class FileLogger implements LoggerInf {

	public void write(String logText) {
		System.out.println("Write Log to File :: "+logText);
	}
	
	@PostConstruct
	public void initializeDBMtd() {
		System.out.println("Initialize File Method annotation is @PostConstruct");
	}
	
	@PreDestroy
	public void destoryDBMtd() {
		System.out.println("Destroy File Method annotation is @PreDestory");
	}
}
