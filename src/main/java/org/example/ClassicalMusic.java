package org.example;

public class ClassicalMusic implements Music{

    private ClassicalMusic () {

    }
    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void initMethod() {
        System.out.println("init method");
    }

    public void destroyMethod() {
        System.out.println("destroy method");
    }

    @Override
    public String getSong() {
        return "ClassicalSong";
    }
}