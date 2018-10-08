package at.hochbichler.spring5.springbootjokesapp;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootJokesAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJokesAppApplication.class, args);
    }

}
