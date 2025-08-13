package ru.alishev.spring.lesson8;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.alishev.spring.lesson6.Music;
import ru.alishev.spring.lesson6.MusicPlayer;


public class TestContext {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "lesson8/application-context.xml"
        );

        Music music0 = context.getBean("classicalMusicBean", Music.class);
        System.out.println("classicalMusicBean " + music0.getSong());

        Music music3 = context.getBean("classicalMusicBean", Music.class);
        System.out.println(music0 == music3);

        Music music1 = context.getBean("rockMusicBean", Music.class);
        System.out.println("rockMusicBean " + music1.getSong());

        Music music2 = context.getBean("rockMusicBean", Music.class);
        System.out.println("rockMusicBean " + music2.getSong());

        context.close();
    }
}
