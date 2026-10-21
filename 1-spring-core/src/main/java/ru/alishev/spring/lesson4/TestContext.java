package ru.alishev.spring.lesson4;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.alishev.spring.lesson3.TestBean;

public class TestContext {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "lesson4/application-context.xml"
        );

        Music music = context.getBean("musicBean", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);;
        musicPlayer.play();

        context.close();
    }
}
