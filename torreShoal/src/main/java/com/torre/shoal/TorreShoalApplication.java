package com.torre.shoal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class TorreShoalApplication {
	
	@Bean
    public RestTemplate getRestemplate() {
        return new RestTemplate();
    }

	public static void main(String[] args) {
		SpringApplication.run(TorreShoalApplication.class, args);
	}

}
