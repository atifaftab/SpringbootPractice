package com.practice;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import com.practice.qualifier.PizzaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringBootPracticeApplication {
//    private static final Logger LOGGER = LogManager.getLogger(SpringBootPracticeApplication.class);


    public static void main(String[] args) {
        SpringApplication.run(SpringBootPracticeApplication.class, args);

//        var context = SpringApplication.run(SpringBootPracticeApplication.class, args);
//        PizzaController pizzaController = (PizzaController) context.getBean("pizzaController");
//        LOGGER.info("Info level logging");
//        LOGGER.debug("Debugging.....");
//        LOGGER.error("ALERT------ERROR");
//        System.out.println(pizzaController.getPizza());

    }
}
