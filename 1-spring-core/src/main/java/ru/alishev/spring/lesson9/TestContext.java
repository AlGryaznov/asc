package ru.alishev.spring.lesson9;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;

public class TestContext {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "lesson9/application-context.xml"
        );

        Music music = context.getBean("someRockMusic", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);;
        musicPlayer.play();

        HashMap set = new HashMap();

        context.close();
    }
}
