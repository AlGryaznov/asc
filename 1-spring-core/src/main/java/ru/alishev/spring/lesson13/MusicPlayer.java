package ru.alishev.spring.lesson13;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

//@Component
public class MusicPlayer {

    private  Random random;
    @Value("${musicPlayer.name}")
    private String Name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private List<Music> musicList;

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

    public MusicPlayer(List<Music> musicList, Random random) {
        System.out.println("autowired thought contructor");
        this.musicList = musicList;
        this.random = random;
    }

    public String playMusic() {

        return musicList.get(random.nextInt(musicList.size())).getSong();

    }
}
