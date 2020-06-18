package com.core.shibaev.task3.creator;

import com.core.shibaev.task3.entity.Ball;
import com.core.shibaev.task3.entity.BallColor;
import com.core.shibaev.task3.entity.Basket;
import com.core.shibaev.task3.exeption.CustomException;
import com.core.shibaev.task3.validator.BallValidator;

public class BallCreator {
    public void add(double weight, BallColor ballColor, double radius, Basket basket) throws CustomException {
        BallValidator ballValidator = new BallValidator();
        Ball ball;
        if (ballValidator.addBallValidation(radius, weight)) {
            if (basket.addBall(new Ball(weight, ballColor, radius))) {
                return;
            }
        }
        throw new CustomException("Wrong add");
    }

    public Basket hardCodeFillUp(Basket basket) throws CustomException {
        add(15, BallColor.BLUE, 1.5, basket);
        add(10, BallColor.GREEN, 2, basket);
        add(5, BallColor.RED, 3, basket);
        add(10, BallColor.BLACK, 1.5, basket);
        add(15, BallColor.BLUE, 1, basket);
        return basket;
    }

}
