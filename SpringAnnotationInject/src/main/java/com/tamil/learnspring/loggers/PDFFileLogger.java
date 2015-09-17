/**
 * @author	: Murugan_Nagarajan
 * @date	: Sep 12, 2015
 * @time	: 6:02:13 PM
 */
package com.tamil.learnspring.loggers;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Qualifier;

import com.tamil.learnspring.loggerinf.FileLoggerInf;
import com.tamil.learnspring.loggerinf.LoggerInf;

/**
 * @author Murugan_Nagarajan
 *
 */
@Qualifier("pdffilelogger")
public class PDFFileLogger implements LoggerInf, FileLoggerInf {

	public void write(String logText) {
		System.out.println("Write Log to PDF File :: "+logText);
	}

	/* (non-Javadoc)
	 * @see com.tamil.learnspring.loggerinf.FileLoggerInf#writeLogToFile(java.lang.String)
	 */
	public void writeLogToFile(String log) {
		this.write(log);	
	}
	
	@PostConstruct
	public void initializeFileMtd() {
		System.out.println("Initialize PDF File Method annotation is @PostConstruct");
	}
	
	@PreDestroy
	public void destoryFileMtd() {
		System.out.println("Destroy PDF File Method annotation is @PreDestory");
	}
}
