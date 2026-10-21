package ru.alishev.spring.lesson13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

//@Component
public class CountryMusic implements Music {

    private Random rand;
    private List<String> songs = List.of(
            "SAM HUNT - Country House",
            "MORGAN WALLEN - Just In Case",
            "TYLER HUBBARD - Park"
    );

    //@Autowired
    public CountryMusic(Random random) {
        this.rand = random;
    }

    public MusicType musicType() {
        return MusicType.COUNTRY;
    }

    @Override
    public String getSong() {
        return songs.get(rand.nextInt(songs.size()));
    }
}
