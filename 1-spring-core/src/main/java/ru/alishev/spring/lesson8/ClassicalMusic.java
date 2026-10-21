package ru.alishev.spring.lesson8;

import ru.alishev.spring.lesson6.Music;

public class ClassicalMusic implements Music {

    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusicFabric() {
        return new ClassicalMusic();
    }

    public void init() {
        System.out.println("init ClassicalMusic");
    }

    public void destroy() {
        System.out.println("destroy ClassicalMusic");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
