package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private Music rockMusic;
    private Music classicalMusic;

    public MusicPlayer(@Qualifier("rockMusic") Music rockMusic, @Qualifier("classicalMusic") Music classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }

    public String playMusic(MusicGenre genre) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        switch (genre) {
            case ROCK:
                return rockMusic.getSong().get(randomNumber);
            case CLASSICAL:
                return classicalMusic.getSong().get(randomNumber);
            default:
                return null;
        }
    }
}
