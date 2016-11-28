package edu.ccs.util.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.splunk.logging.*;

/**
 * Class for getting a logger with predefined configurations.
 * 
 * The idea is to provide a way for developers to very simply get a logger
 * 		without having to do all the configuration for every application.
 * 
 * The configuration is set in this logging library and all applications
 * 		will use the same configuration
 * 
 * By using this Logger wrapper we are basically using the paradigm
 * 		convention over configuration.
 * 
 * @author Tom Caflisch
 */
public class LogFactory {
	
	/**
	 * Gets a logger object
	 * 
	 * @param clazz	- The classname that we are logging in
	 * @return		- A logger object
	 */
	public static Logger getLogger(Class<?> clazz) {
		return LoggerFactory.getLogger(clazz);
	}
}
