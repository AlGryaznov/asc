package ru.alishev.spring.lesson13;

import org.springframework.context.annotation.*;


import java.util.List;
import java.util.Random;

@Configuration
//@ComponentScan("ru.alishev.spring.lesson13")
@PropertySource("classpath:lesson13/musicPlayer.properties")
public class SpringConfig {

    @Bean
    @Scope("prototype")
    ClassicalMusic classicalMusic() {
        return new ClassicalMusic(random());
    }

    @Bean
    CountryMusic countryMusic() {
        return new CountryMusic(random());
    }

    @Bean
    RockMusic rockMusic() {
        return new RockMusic(random());
    }

    @Bean
    Random random() {
        return new Random();
    }

    @Bean
    List<Music> musicList(ClassicalMusic classicalMusic, CountryMusic countryMusic, RockMusic rockMusic) {

        return List.of(classicalMusic,countryMusic,rockMusic);
    }

    @Bean
    MusicPlayer musicPlayer(List<Music> musicList, Random random) {
        return new MusicPlayer(musicList, random);
    }

    @Bean
    Computer computer(MusicPlayer musicPlayer) {
        return new Computer(musicPlayer);
    }
}
