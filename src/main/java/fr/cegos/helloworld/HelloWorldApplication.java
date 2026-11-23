package fr.cegos.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

    // Ligne qui est executée lorsqu'on démarre l'application
    public static void main(String[] args) {
        // cette instruction lance l'application Web
        SpringApplication.run(HelloWorldApplication.class, args);
    }
}
