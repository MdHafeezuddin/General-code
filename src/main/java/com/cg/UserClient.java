package com.cg;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.cg.User;
@Configuration
@EnableAutoConfiguration
@ComponentScan("com.cg")
public class UserClient {
	
	public static void main(String args[]) throws Exception 
	{
		ApplicationContext context = SpringApplication.run(UserClient.class, args);
		User user1 = (User) 
				context.getBean("u");
		
		System.out.println(user1.getCarnumber());
		System.out.println(user1.getCompany());	
		System.out.println(user1.getUserName());
	}

}
