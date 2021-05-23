package com.neev.processing;

import processing.core.PApplet;
import java.util.ArrayList;
import java.util.List;

public class ProcessingInitiator extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int NUMBER_OF_BALLS = 4;
    List<Ball> listOfBalls = new ArrayList<>();

    public static void main(String[] args) {
        PApplet.main("com.neev.processing.ProcessingInitiator", args);
    }

    private void createBalls() {
        for (int ballNo = 1; ballNo <= NUMBER_OF_BALLS; ballNo++) this.listOfBalls.add(new Ball(ballNo));
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        createBalls();
    }

    @Override
    public void draw() {
        for (Ball ball : listOfBalls) {
            ellipse(setSpeed(ball), ball.setBallHeight(4, HEIGHT), Ball.SIZE, Ball.SIZE);
        }
    }

    private float setSpeed(Ball ball) {
        float position = ball.ballCurrentPosition + ball.ballNo;
        return ball.setBallPosition(position);
    }

}
