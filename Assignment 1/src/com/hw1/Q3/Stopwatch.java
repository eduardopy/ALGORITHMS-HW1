package com.hw1.Q3;

public class Stopwatch {
    private final long start;

    public Stopwatch(){
        start = System.currentTimeMillis(); //this is to find the current time
    }

    public double elapsedTime(){
        long now = System.currentTimeMillis();
        return (now - start); //finds elapsed time
    }
}