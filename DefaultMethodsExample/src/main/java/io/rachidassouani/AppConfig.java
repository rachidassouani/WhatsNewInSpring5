package io.rachidassouani;

import org.springframework.context.annotation.Bean;

public interface AppConfig {

	@Bean
	default ShowMessageBean getMessageBean() {
		return new ShowMessageBean();
	}
}
