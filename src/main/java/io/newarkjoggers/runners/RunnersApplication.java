package io.newarkjoggers.runners;

import foo.bar.WelcomeMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunnersApplication {

	public static void main(String[] args) {

		// Initial code given, to start the program/ determines how the application will run
		SpringApplication.run(RunnersApplication.class, args);
		//Generating new instance of imported class for use
		var welcomeMessage = new WelcomeMessage();
		//Calling method from generated class instance
		System.out.println(welcomeMessage.getWelcomeMessage());
	}
};
