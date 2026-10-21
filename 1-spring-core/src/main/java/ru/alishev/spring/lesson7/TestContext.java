package ru.alishev.spring.lesson7;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.alishev.spring.lesson6.MusicPlayer;


public class TestContext {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "lesson7/application-context.xml"
        );

        MusicPlayer musicPlayer1 = context.getBean("musicPlayerBean", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayerBean", MusicPlayer.class);


        System.out.println(musicPlayer1 != musicPlayer2);
        System.out.println(musicPlayer1);
        System.out.println(musicPlayer2);
        musicPlayer1.setVolume(100000000);
        System.out.println(musicPlayer1.getName());
        System.out.println(musicPlayer1.getVolume());
        System.out.println(musicPlayer2.getName());
        System.out.println(musicPlayer2.getVolume());

        context.close();
    }
}
