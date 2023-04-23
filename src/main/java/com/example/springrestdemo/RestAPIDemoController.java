package com.example.springrestdemo;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestAPIDemoController {
    private List<Coffee> coffees = new ArrayList<>();

    public RestAPIDemoController() {
        coffees.add(new Coffee("Cappuccino"));
        coffees.add(new Coffee("Espresso"));
        coffees.add(new Coffee("Latte"));
    }
}
