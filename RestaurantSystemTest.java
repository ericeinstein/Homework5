import static org.junit.Assert.*;
import org.junit.Test;

public class RestaurantSystemTest {

    @Test
    public void testBaseFoodItem() {
        FoodItem burger = new BaseFoodItem("Burger", 5.99);
        assertEquals(5.99, burger.getPrice(), 0.01);
    }

    @Test
    public void testTopping() {
        FoodItem burger = new BaseFoodItem("Burger", 5.99);
        FoodItem burgerWithCheese = new Topping(burger, "Cheese", 1.00);
        assertEquals(6.99, burgerWithCheese.getPrice(), 0.01);
    }

    @Test
    public void testCalculateTotalCost() {
        FoodItem burger = new BaseFoodItem("Burger", 5.99);
        FoodItem fries = new BaseFoodItem("Fries", 2.49);
        FoodItem burgerWithCheese = new Topping(burger, "Cheese", 1.00);
        FoodItem friesWithSauce = new Topping(fries, "Sauce", 0.50);

        Order order = new Order();
        order.addItem(burgerWithCheese);
        order.addItem(friesWithSauce);

        assertEquals(9.98, order.calculateTotalCost(), 0.01);
    }

    @Test
    public void testApplyDiscount() {
        assertEquals(90.0, LoyaltyStatus.applyDiscount(100.0, 1), 0.01);
        assertEquals(80.0, LoyaltyStatus.applyDiscount(100.0, 2), 0.01);
        assertEquals(100.0, LoyaltyStatus.applyDiscount(100.0, 3), 0.01);
    }
}