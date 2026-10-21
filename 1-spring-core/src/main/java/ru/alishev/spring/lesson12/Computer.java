package ru.alishev.spring.lesson12;

import org.springframework.stereotype.Component;

@Component
public class Computer {

    private int id;

    public MusicPlayer getMusicPlayer() {
        return musicPlayer;
    }

    private MusicPlayer musicPlayer;

    public Computer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
        this.id = 1;
    }

    @Override
    public String toString() {
        return "Computer id=" + id + "\n" +
                "musicPlayer play:" + "\n" +
                "rock song " + musicPlayer.play(MusicType.ROCK) + id + ",\n" +
                "country song " + musicPlayer.play(MusicType.COUNTRY) + id + ",\n" +
                "classical song " + musicPlayer.play(MusicType.CLASSICAL) + id + ",\n" ;

    }
}
