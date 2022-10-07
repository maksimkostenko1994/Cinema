package org.cinema.classes;

import org.cinema.interfaces.Music;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

//@Component
public class MusicPlayer {

    private final List<Music> playList;

//    @Autowired
    public MusicPlayer(List<Music> playList) {
        this.playList = playList;
    }

    public String playMusic() {
        AtomicReference<String> res = new AtomicReference<>("");
        playList.forEach(music -> res.set(res + "Playing: " + music.getSong() + ";\n"));
        System.out.println(res);
        return res.get();
    }
}
