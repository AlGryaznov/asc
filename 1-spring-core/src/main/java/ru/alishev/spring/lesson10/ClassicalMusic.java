package ru.alishev.spring.lesson10;

import org.springframework.stereotype.Component;

@Component("someClassicalMusic")
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
