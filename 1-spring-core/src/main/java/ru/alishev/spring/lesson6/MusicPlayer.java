package ru.alishev.spring.lesson6;


import java.util.List;

public class MusicPlayer {

    private String Name;
    private int volume;

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

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

    public MusicPlayer() {}
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void play() {

        musicList.stream().map(Music::getSong).forEach(System.out::println);
    }
}
