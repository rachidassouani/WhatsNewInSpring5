package io.rachidassouani;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class App implements AppConfig {
    public static void main(String[] args) {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		MessageBean messageBean = context.getBean(ShowMessageBean.class);
		messageBean.showMessage("Test Message");
		
		context.close();

	}
}
