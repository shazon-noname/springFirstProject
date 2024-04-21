package org.example;

public class ClassicalMusic implements Music{

    @Override
    public String getSong() {
        return "ClassicalSong";
    }

    public void initMethod() {
        System.out.println("init method");
    }

    public void destroyMethod() {
        System.out.println("destroy method");
    }
}