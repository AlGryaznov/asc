package ru.alishev.spring.lesson8;

import ru.alishev.spring.lesson9.Music;

public class RockMusic implements Music {

    public void init() {
        System.out.println("init RockMusic");
    }

    public void destroy() {
        System.out.println("destroy RockMusic");
    }

    @Override
    public String getSong() {
        return "Bohemia Rhapsody";
    }
}
