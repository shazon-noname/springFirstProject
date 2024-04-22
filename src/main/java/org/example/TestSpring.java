package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println("playing classical - " + musicPlayer.playMusic(MusicGenre.CLASSICAL));
        System.out.println("playing rock - " + musicPlayer.playMusic(MusicGenre.ROCK));
        context.close();
    }
}
