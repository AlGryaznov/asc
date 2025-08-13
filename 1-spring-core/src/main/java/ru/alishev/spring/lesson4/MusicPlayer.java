package ru.alishev.spring.lesson4;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private String Name;
    private int volume;
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


    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void play() {

        System.out.println(music.getSong());
    }
}
