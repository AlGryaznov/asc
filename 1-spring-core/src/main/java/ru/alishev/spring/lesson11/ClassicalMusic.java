package ru.alishev.spring.lesson11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music {
    private Random rand;
    private List<String> songs = List.of(
            "André Rieu - Happy Days",
            "Sheku Kanneh-Mason - Elgar",
            "Max Richter - Voices"
    );

    @Autowired
    public ClassicalMusic(Random random) {
        this.rand = random;
    }

    @Override
    public String getSong() {
        return songs.get(rand.nextInt(songs.size()));
    }
}
