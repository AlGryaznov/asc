package ru.alishev.spring.lesson12;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestContext {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "lesson12/application-context.xml"
        );

        var computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        var musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        var classicalMusicBean1 = context.getBean("classicalMusic", Music.class);
        System.out.println("classicalMusicBean " + classicalMusicBean1.getSong());

        var classicalMusicBean2 = context.getBean("classicalMusic", Music.class);
        System.out.println(classicalMusicBean1 == classicalMusicBean2);


        context.close();
    }
}
