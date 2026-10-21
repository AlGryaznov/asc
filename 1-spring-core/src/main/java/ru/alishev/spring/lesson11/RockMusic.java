package ru.alishev.spring.lesson11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music {

    private Random rand;
    private List<String> songs = List.of(
            "U2 - Pain",
            "Nickelback - How You Remind Me",
            "Foo Fighters - Something from Nothing"
    );

    @Autowired
    public RockMusic(Random random) {
        this.rand = random;
    }

    @Override
    public String getSong() {
        return songs.get(rand.nextInt(songs.size()));
    }
}
