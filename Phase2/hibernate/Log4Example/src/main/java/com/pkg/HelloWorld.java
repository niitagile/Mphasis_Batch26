package com.pkg;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class HelloWorld {
private static final Logger logger=LogManager.getLogger(HelloWorld.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		logger.info("Hello All");
		logger.debug("This is debug info");
		logger.error("An exception thrown");

	}

}
