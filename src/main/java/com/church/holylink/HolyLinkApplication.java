package com.church.holylink;

import com.church.holylink.config.multitenant.EnableMultitenantModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableMultitenantModule
@SpringBootApplication
public class HolyLinkApplication {

	public static void main(String[] args) {
		SpringApplication.run(HolyLinkApplication.class, args);
	}

}
