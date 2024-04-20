package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = classPathXmlApplicationContext.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

        classPathXmlApplicationContext.close();

    }
}
