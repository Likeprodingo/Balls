package com.shibaev.task3.creator;

import com.shibaev.task3.entity.Ball;
import com.shibaev.task3.entity.BallColor;
import com.shibaev.task3.entity.Basket;
import com.shibaev.task3.exeption.CustomException;
import com.shibaev.task3.service.BasketService;
import com.shibaev.task3.validator.BallValidator;

public class BallCreator {

    public Basket hardCodeFillUp(Basket basket) throws CustomException {
        BasketService basketService = new BasketService();
        basketService.add(15, BallColor.BLUE, 1.5, basket);
        basketService.add(10, BallColor.GREEN, 2, basket);
        basketService.add(5, BallColor.RED, 3, basket);
        basketService.add(10, BallColor.BLACK, 1.5, basket);
        basketService.add(15, BallColor.BLUE, 1, basket);
        return basket;
    }

}
