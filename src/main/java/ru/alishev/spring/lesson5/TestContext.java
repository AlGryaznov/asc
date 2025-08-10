package ru.alishev.spring.lesson5;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.alishev.spring.lesson4.Music;
import ru.alishev.spring.lesson4.MusicPlayer;

public class TestContext {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "application-context.xml"
        );


        MusicPlayer musicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);
        musicPlayer.play();

        context.close();
    }
}
