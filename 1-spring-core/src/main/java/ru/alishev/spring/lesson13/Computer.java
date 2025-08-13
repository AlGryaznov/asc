package ru.alishev.spring.lesson13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {

    private int id;

    public MusicPlayer getMusicPlayer() {
        return musicPlayer;
    }

    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
        this.id = 1;
    }

    @Override
    public String toString() {
        return "Computer id=" + id + "\n" +
                "musicPlayer play:" + "\n" +
                "rock song " + musicPlayer.playMusic() + ",\n" +
                "country song " + musicPlayer.playMusic() + ",\n" +
                "classical song " + musicPlayer.playMusic() + ",\n" ;

    }
}
