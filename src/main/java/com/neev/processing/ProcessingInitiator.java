package com.neev.processing;

import org.jetbrains.annotations.NotNull;
import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class ProcessingInitiator extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int NUMBER_OF_BALLS = 4;

    public static void main(String[] args) {
        PApplet.main("com.neev.processing.ProcessingInitiator", args);
    }

    @NotNull
    private static List<Ball> createBalls() {
        List<Ball> listOfBalls = new ArrayList<>();
        for (int ballNo = 1; ballNo <= NUMBER_OF_BALLS; ballNo++) listOfBalls.add(new Ball(ballNo));
        return listOfBalls;
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        List<Ball> listOfBalls = createBalls();
        for (Ball ball : listOfBalls) {
            ellipse(ball.ballCurrentPosition, ball.setBallHeight(4, HEIGHT), Ball.SIZE, Ball.SIZE);
        }
    }

}
