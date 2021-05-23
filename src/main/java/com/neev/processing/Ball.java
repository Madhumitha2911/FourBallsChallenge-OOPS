package com.neev.processing;

public class Ball {
    static final float SIZE = 15;
    public final int ballNo;
    float ballCurrentPosition = 0;


    public Ball(int ballNo) {
        this.ballNo = ballNo;
    }

    public float setBallHeight(int numberOfBalls, int screenHeight) {
        int noOfDivisions = numberOfBalls + 1;
        return (float) (screenHeight * this.ballNo) / noOfDivisions;
    }

    public float increaseSpeed() {
        this.ballCurrentPosition += this.ballNo;
        return this.ballCurrentPosition;

    }

}
