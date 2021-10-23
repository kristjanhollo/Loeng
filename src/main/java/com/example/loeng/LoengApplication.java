package com.example.loeng;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoengApplication implements CommandLineRunner {





    private DisplayItem displayItem;

    public LoengApplication(DisplayItem displayItem) {
        this.displayItem = displayItem;
    }

    public static void main(String[] args) {
        SpringApplication.run(LoengApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        displayItem.paint();
    }
}
