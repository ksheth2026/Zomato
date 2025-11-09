package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

/**
 * @author kushalsheth
 * @since 08/11/25
 */
@SpringBootApplication
@EnableMongoAuditing
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}