package com.neev.processing;

import processing.core.PApplet;

import java.util.List;

public class ProcessingInitiator extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int NUMBER_OF_BALLS = 4;
    private static  List<Ball> listOfBalls;

    public static void main(String[] args) {
        PApplet.main("com.neev.processing.ProcessingInitiator", args);
        createBalls();
    }

    private static void createBalls() {
        for (int ballNo = 0; ballNo < NUMBER_OF_BALLS; ballNo++) {
            listOfBalls.add(new Ball(ballNo));
        }
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }


}
