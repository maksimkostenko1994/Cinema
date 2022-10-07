package org.cinema.config;

import org.cinema.classes.Computer;
import org.cinema.classes.MusicPlayer;
import org.cinema.genres.ClassicalMusic;
import org.cinema.genres.PopMusic;
import org.cinema.genres.RockMusic;
import org.cinema.interfaces.Music;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
//@ComponentScan("org.cinema")
@PropertySource("classpath:musicPlayer.properties")
public class MusicConfig {

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public PopMusic popMusic() {
        return new PopMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        List<Music> genres = new ArrayList<>(3);
        genres.add(classicalMusic());
        genres.add(rockMusic());
        genres.add(popMusic());

        return new MusicPlayer(genres);
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
