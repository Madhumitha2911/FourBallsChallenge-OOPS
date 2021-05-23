package com.neev.processing;

import processing.core.PApplet;

public class ProcessingInitiator extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int NUMBER_OF_BALLS = 4;

    public static void main(String[] args) {
        PApplet.main("com.neev.processing.ProcessingInitiator", args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }
}
