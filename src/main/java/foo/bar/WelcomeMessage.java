package foo.bar;

import org.springframework.stereotype.Component;

@Component
public class WelcomeMessage {
    // creating a simple function for the application's use
    public String getWelcomeMessage(){
        return "Welcome to the Spring Boot Application";
    }
}
