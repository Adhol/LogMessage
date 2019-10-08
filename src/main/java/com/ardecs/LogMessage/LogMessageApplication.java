package com.ardecs.LogMessage;


import org.springframework.context.annotation.Bean;
import org.springframework.boot.SpringApplication;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogMessageApplication {

	private Logger logger;

	public LogMessageApplication() {
		this.logger = LoggerFactory.getLogger(LogMessageApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(LogMessageApplication.class, args);
	}

	@Bean
	public void printLogMessage() {
		this.logger.info("---Some message in log---");
	}
}
