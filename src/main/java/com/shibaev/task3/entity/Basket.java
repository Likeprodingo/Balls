package com.shibaev.task3.entity;

import java.util.ArrayList;

public class Basket {
    private double capacity;
    private ArrayList<Ball> balls = new ArrayList<Ball>();

    public Basket(double capacity) {
        this.capacity = capacity;
    }

    public boolean addBall(Ball ball) {
        boolean result = true;
        if (capacity - calculateOccupiedSpace() > ball.calculateSize()) {
            balls.add(ball);
        } else {
            result = false;
        }
        return result;
    }

    public double calculateOccupiedSpace() {
        double size = 0;
        for (Ball ball : balls) {
            size += ball.calculateSize();
        }
        return size;
    }

    public double getCapacity() {
        return capacity;
    }

    public int getBallsNumber() {
        return balls.size();
    }

    public Ball getBall(int index) {
        return balls.get(index);
    }
}
