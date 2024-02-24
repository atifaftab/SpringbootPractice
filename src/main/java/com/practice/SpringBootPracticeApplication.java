package com.practice;

import com.practice.qualifier.PizzaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootPracticeApplication {

    public static void main(String[] args) {

        var context = SpringApplication.run(SpringBootPracticeApplication.class, args);
        PizzaController pizzaController = (PizzaController) context.getBean("pizzaController");
        System.out.println(pizzaController.getPizza());

    }
}
