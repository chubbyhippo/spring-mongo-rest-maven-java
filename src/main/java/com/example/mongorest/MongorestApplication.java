package com.example.mongorest;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
@Slf4j
public class MongorestApplication implements CommandLineRunner {

    private final CustomerRepository repository;

    @Override
    public void run(String... args) {

        repository.deleteAll();

        repository.save(Customer.builder().firstName("Alice").lastName("Josh").build());
        repository.save(Customer.builder().firstName("Bob").lastName("Smith").build());
        repository.save(Customer.builder().firstName("Dick").lastName("Smith").build());
        repository.save(Customer.builder().firstName("John").lastName("Dick").build());
        repository.save(Customer.builder().firstName("Alita").lastName("Smith").build());
        repository.save(Customer.builder().id("test").firstName("Tomiyo").lastName("Kawasaki").build());
        repository.save(Customer.builder().firstName("Jane").lastName("Samuel").build());
        repository.save(Customer.builder().firstName("Don").lastName("Lasta").build());
        repository.save(Customer.builder().firstName("Bob").lastName("Maran").build());
        repository.save(Customer.builder().firstName("test").lastName("Komasu").build());
        repository.save(Customer.builder().firstName("Tom").lastName("Hedge").build());
        repository.save(Customer.builder().firstName("Mike").lastName("Maya").build());
        repository.save(Customer.builder().firstName("Douglas").lastName("Tokoka").build());
        repository.save(Customer.builder().firstName("Carter").lastName("Shade").build());
        repository.save(Customer.builder().firstName("Jane").lastName("Sheppard").build());
        repository.save(Customer.builder().firstName("John").lastName("Sheppard").build());
        repository.save(Customer.builder().firstName("Max").lastName("Milton").build());
        repository.save(Customer.builder().id("test").firstName("Julius").lastName("Caesar").build());

        log.info("Customers found with findAll():");
        log.info("-------------------------------");
        for (Customer customer : repository.findAll()) {
            log.info(String.valueOf(customer));
        }

    }

    public static void main(String[] args) {
        SpringApplication.run(MongorestApplication.class, args);
    }


}
