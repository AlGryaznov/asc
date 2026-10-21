package ru.alishev.spring.lesson12;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;


@Component
@Scope("singleton")
public class ClassicalMusic implements Music {
    private Random rand;
    private List<String> songs = List.of(
            "André Rieu - Happy Days",
            "Sheku Kanneh-Mason - Elgar",
            "Max Richter - Voices"
    );

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct ClassicalMusic");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("PreDestroy ClassicalMusic");
    }

    @Autowired
    public ClassicalMusic(Random random) {
        this.rand = random;
    }

    @Override
    public String getSong() {
        return songs.get(rand.nextInt(songs.size()));
    }
}
