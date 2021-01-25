package com.dmcthreads.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DmcThreadsApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(DmcThreadsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DmcThreadsApplication.class, args);
		LOGGER.info("DmcThreadsApplication started successfully.");
	}

}
