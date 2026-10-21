package ru.alishev.spring.lesson9;

import org.springframework.stereotype.Component;

@Component("someRockMusic")
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Bohemia Rhapsody";
    }
}
