package com.core.shibaev.task3.service;

import com.core.shibaev.task3.entity.Ball;
import com.core.shibaev.task3.entity.BallColor;
import com.core.shibaev.task3.entity.Basket;
import com.core.shibaev.task3.exeption.CustomException;
import com.core.shibaev.task3.validator.BallValidator;

import java.util.ArrayList;

public class BasketService {

    public int blueBallCount(Basket basket) {
        int count = 0;
        ArrayList<Ball> balls = new ArrayList<Ball>();
        for (int i = 0; i < basket.getBallsNumber(); i++) {
            balls.add(basket.getBall(i));
        }
        for (Ball ball : balls) {
            if (ball.getColor() == BallColor.BLUE) {
                count++;
            }
        }
        return count;
    }

    public double calculateBallsWeight(Basket basket) {
        double sum = 0;
        ArrayList<Ball> balls = new ArrayList<Ball>();
        for (int i = 0; i < basket.getBallsNumber(); i++) {
            balls.add(basket.getBall(i));
        }
        for (Ball ball : balls) {
            sum += ball.getWeight();
        }
        return sum;
    }

}
