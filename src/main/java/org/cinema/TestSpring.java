package org.cinema;

import org.cinema.classes.Computer;
import org.cinema.classes.MusicPlayer;
import org.cinema.config.MusicConfig;
import org.cinema.genres.ClassicalMusic;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MusicConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

        context.close();
    }
}
