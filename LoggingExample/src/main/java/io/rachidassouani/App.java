package io.rachidassouani;

import org.apache.logging.log4j.LogManager;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import org.apache.logging.log4j.Logger;

@Configuration
public class App implements AppConfig {
	
	private static final Logger logger = LogManager.getLogger(App.class);
	
    public static void main(String[] args) {
    	logger.trace("Starting up application");
    	
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		MessageBean messageBean = context.getBean(ShowMessageBean.class);
		messageBean.showMessage("Test Message");
		context.close();
		
		logger.trace("Shutting down application");

	}
}
