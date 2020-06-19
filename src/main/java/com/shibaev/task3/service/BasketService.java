package com.shibaev.task3.service;

import com.shibaev.task3.entity.Ball;
import com.shibaev.task3.entity.BallColor;
import com.shibaev.task3.entity.Basket;
import com.shibaev.task3.exeption.CustomException;
import com.shibaev.task3.validator.BallValidator;

import java.util.ArrayList;

public class BasketService {

    public int blueBallCount(Basket basket) {
        int count = 0;
        if (basket != null) {
            ArrayList<Ball> balls = new ArrayList<Ball>();
            for (int i = 0; i < basket.getBallsNumber(); i++) {
                balls.add(basket.getBall(i));
            }
            for (Ball ball : balls) {
                if (ball.getColor() == BallColor.BLUE) {
                    count++;
                }
            }
        }
        return count;
    }

    public double calculateBallsWeight(Basket basket) {
        double sum = 0;
        if (basket != null) {
            ArrayList<Ball> balls = new ArrayList<Ball>();
            for (int i = 0; i < basket.getBallsNumber(); i++) {
                balls.add(basket.getBall(i));
            }
            for (Ball ball : balls) {
                sum += ball.getWeight();
            }
        }
        return sum;
    }

    public void add(double weight, BallColor ballColor, double radius, Basket basket) throws CustomException {
        if (basket != null) {
            BallValidator ballValidator = new BallValidator();
            Ball ball;
            if (ballValidator.addBallValidation(radius, weight)) {
                if (basket.addBall(new Ball(weight, ballColor, radius))) {
                    return;
                }
            }
        }
        throw new CustomException("Wrong add");
    }
}
