/**
 * @author	: Murugan_Nagarajan
 * @date	: Sep 12, 2015
 * @time	: 6:02:03 PM
 */
package com.tamil.learnspring.loggers;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

import com.tamil.learnspring.loggerinf.LoggerInf;

/**
 * @author Murugan_Nagarajan
 *
 */
@Component("dbLogger")
public class DBLogger implements LoggerInf {

	public void write(String logText) {
		System.out.println("Write Log to DB :: "+logText);
	}
	
	@PostConstruct
	public void initializeDBMtd() {
		System.out.println("Initialize DB Method annotation is @PostConstruct");
	}
	
	@PreDestroy
	public void destoryDBMtd() {
		System.out.println("Destroy DB Method annotation is @PreDestory");
	}
}
