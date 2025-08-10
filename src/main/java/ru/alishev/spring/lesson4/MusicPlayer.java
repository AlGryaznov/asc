package ru.alishev.spring.lesson4;

public class MusicPlayer {

    Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }
    public void play() {
        System.out.println(music.getSong());
    }
}
