package ru.alishev.spring.lesson12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String Name;
    @Value("${musicPlayer.volume}")
    private int volume;
    //@Autowired
    private Music rockMusic;
    private Music countryMusic;
    private Music classicalMusic;

    //@Autowired
    public void setMusic(Music music) {

        System.out.println("autowired thought setter");
        this.rockMusic = music;
        this.countryMusic = music;
    }

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

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music rockMusic,
                       @Qualifier("countryMusic") Music countryMusic,
                       @Qualifier("classicalMusic") Music classicalMusic) {
        System.out.println("autowired thought contructor");
        this.rockMusic = rockMusic;
        this.countryMusic = countryMusic;
        this.classicalMusic = classicalMusic;
    }

    public String play(MusicType musicType) {

        return switch (musicType) {
            case ROCK -> rockMusic.getSong();
            case COUNTRY -> countryMusic.getSong();
            case CLASSICAL -> classicalMusic.getSong();
        };
    }
}
