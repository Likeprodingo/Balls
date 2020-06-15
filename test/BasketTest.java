import com.core.shibaev.task3.entety.Basket;
import com.core.shibaev.task3.service.BasketService;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class BasketTest {
    BasketService basketService = new BasketService();

    @Test
    public void blueBallCountTest() {
        int expected = 2;
        Basket basket = new Basket(1000);
        basket = basketService.hardCodeFillUp(basket);
        int  actual = basketService.blueBallCount(basket);
        assertEquals(actual,expected);
    }
    @Test
    public void ballWeightTest() {
        double expected = 90;
        Basket basket = new Basket(1000);
        basket = basketService.hardCodeFillUp(basket);
        double actual = basketService.calculateBallsWeight(basket);
        assertEquals(actual,expected);
    }
}
