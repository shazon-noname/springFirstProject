package org.example;

import org.example.genres.ClassicalMusic;
import org.example.genres.JazzMusic;
import org.example.genres.RockMusic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfiguration {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

    @Bean
    public List<Music> musicList() {
        return Arrays.asList(classicalMusic(),rockMusic(),jazzMusic());
    }

    @Bean
    public JazzMusic jazzMusic() {
        return new JazzMusic();
    }

}
