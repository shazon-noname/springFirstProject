package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        ClassicalMusic musicBean = classPathXmlApplicationContext.getBean("musicBean", ClassicalMusic.class);
        System.out.println(musicBean.getSong());
        ClassicalMusic musicBean2 = classPathXmlApplicationContext.getBean("musicBean", ClassicalMusic.class);
        System.out.println(musicBean2.getSong());


//        MusicPlayer musicPlayer = classPathXmlApplicationContext.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playSong();
//        System.out.println(musicPlayer.getName() + musicPlayer.getVolume());
//        MusicPlayer secondMusicPlayer = classPathXmlApplicationContext.getBean("musicPlayer", MusicPlayer.class);
//        boolean compraison = musicPlayer == secondMusicPlayer;
//
//        System.out.println(musicPlayer.getVolume());
//
//        secondMusicPlayer.setVolume(35);
//        System.out.println(secondMusicPlayer.getVolume());
//        System.out.println(musicPlayer.getVolume());

        classPathXmlApplicationContext.close();
    }
}
