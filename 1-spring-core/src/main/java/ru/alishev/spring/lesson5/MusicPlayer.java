package ru.alishev.spring.lesson5;


public class MusicPlayer {

    private String Name;
    private int volume;

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

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

    public MusicPlayer() {}
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void play() {

        System.out.println(music.getSong());
    }
}
