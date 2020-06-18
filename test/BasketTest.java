import com.core.shibaev.task3.creator.BallCreator;
import com.core.shibaev.task3.entity.Ball;
import com.core.shibaev.task3.entity.BallColor;
import com.core.shibaev.task3.entity.Basket;
import com.core.shibaev.task3.exeption.CustomException;
import com.core.shibaev.task3.service.BasketService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BasketTest {
    BasketService basketService = new BasketService();
    BallCreator ballCreator = new BallCreator();

    @DataProvider(name = "wrong_data")
    public Object[][] creatorFalseData() {
        return new Object[][]{
                {15,3,BallColor.BLACK,5},
                {10,3,BallColor.GREEN,15},
                {100,5,BallColor.RED,15},
                {-5,1,BallColor.RED,15},
                {5,-1,BallColor.RED,15},
        };
    }

    @Test(enabled = true, expectedExceptions = CustomException.class, expectedExceptionsMessageRegExp = "Wrong add", dataProvider = "wrong_data",groups = {"create_group_test"})
    public void creatorFalseTest(double weight, double radius, BallColor ballColor, double capacity) throws CustomException {
        Basket basket = new Basket(capacity);
        ballCreator.add(weight, ballColor, radius, basket);
    }

    @Test(dependsOnGroups = {"create_group_test"})
    public void blueBallCountTest() throws CustomException {
        int expected = 2;
        Basket basket = new Basket(1000);
        basket = ballCreator.hardCodeFillUp(basket);
        int actual = basketService.blueBallCount(basket);
        assertEquals(actual, expected);
    }

    @Test(dependsOnGroups = {"create_group_test"})
    public void ballWeightTest() throws CustomException {
        double expected = 55;
        Basket basket = new Basket(1000);
        basket = ballCreator.hardCodeFillUp(basket);
        double actual = basketService.calculateBallsWeight(basket);
        assertEquals(actual, expected);
    }
}
