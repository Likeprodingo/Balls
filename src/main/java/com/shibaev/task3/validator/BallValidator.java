package com.shibaev.task3.validator;

public class BallValidator {
    public boolean addBallValidation(double radius, double weight) {
        return !(radius < 0 || weight < 0 || radius > 4 || weight > 30);
    }
}
