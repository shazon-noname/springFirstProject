package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music musicBean = classPathXmlApplicationContext.getBean("musicBean", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(musicBean);

        musicPlayer.playMusic();

        classPathXmlApplicationContext.close();

    }
}
