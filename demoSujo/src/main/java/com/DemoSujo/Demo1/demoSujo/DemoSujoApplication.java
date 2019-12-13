package com.DemoSujo.Demo1.demoSujo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoSujoApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=	SpringApplication.run(DemoSujoApplication.class, args);
		
	//MessageDemo msg = new MessageDemo();
	
	MessageDemo msg1 =context.getBean(MessageDemo.class);
	msg1.Show();////Singleton @Component Dependency Injection
	
	MessageDemo msg2 =context.getBean(MessageDemo.class);
	msg2.Show();
	
		// , Prototype
	}

}
