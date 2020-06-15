package com.core.shibaev.task3.service;

import com.core.shibaev.task3.entety.Ball;
import com.core.shibaev.task3.entety.BallColor;
import com.core.shibaev.task3.entety.Basket;

import java.util.ArrayList;

public class BasketService {

    public int blueBallCount(Basket basket)
    {
        int count = 0;
        ArrayList<Ball> balls = new ArrayList<Ball>();
        for (int i = 0; i < basket.getBallsNumber(); i++) {
            balls.add(basket.getBall(i));
        }
        for (Ball ball: balls)
        {
            if(ball.getColor() == BallColor.BLUE)
            {
                count++;
            }
        }
        return count;
    }
    public double calculateBallsWeight(Basket basket)
    {
        double sum = 0;
        ArrayList<Ball> balls = new ArrayList<Ball>();
        for (int i = 0; i < basket.getBallsNumber(); i++) {
            balls.add(basket.getBall(i));
        }
        for (Ball ball: balls)
        {
           sum+=ball.getWeight();
        }
        return sum;
    }
    public Basket fillUpBasket(Basket basket)
    {
        while(basket.addBall(new Ball(Math.random()*10,BallColor.values()[(int)(Math.random()*10)],Math.random()*5))){}
        return basket;
    }
    public Basket hardCodeFillUp(Basket basket)
    {
        basket.addBall(new Ball(15,BallColor.BLUE,1));
        basket.addBall(new Ball(20,BallColor.BLACK,3));
        basket.addBall(new Ball(20,BallColor.BLACK,2));
        basket.addBall(new Ball(10,BallColor.BLUE,1));
        basket.addBall(new Ball(12,BallColor.YELLOW,4));
        basket.addBall(new Ball(13,BallColor.RED,2));
        return basket;
    }

}
