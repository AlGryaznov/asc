package ru.alishev.spring.lesson10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private String Name;
    private int volume;

    @Autowired
    public void setMusic(Music music) {

        System.out.println("autowired thought setter");
        this.music = music;
    }

    //@Autowired
    private Music music;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public  MusicPlayer() {}

    //@Autowired
    public MusicPlayer(Music music) {
        System.out.println("autowired thought contructor");
        this.music = music;
    }

    public String play() {

        return music.getSong();
    }
}
