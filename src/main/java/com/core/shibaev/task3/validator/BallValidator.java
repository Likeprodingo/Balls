package com.core.shibaev.task3.validator;

public class BallValidator {
    public boolean addBallValidation(double radius, double weight) {
        boolean result = true;
        if (radius < 0 || weight < 0 || radius > 4 || weight > 30) {
            result = false;
        }
        return result;
    }
}
