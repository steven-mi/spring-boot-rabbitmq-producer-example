package com.example.demoproducer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner sendMessageToRabbitMQOnStartup(Producer producer) {
        return (args) -> {
            System.out.println("Start publishing currencies");
            producer.sendMessage(new Currency("EUR", "USD", 1.0F));
            producer.sendMessage(new Currency("EUR", "BTC", 15000.23F));
            producer.sendMessage(new Currency("EUR", "ETH", 1201.0F));
        };
    }
}
