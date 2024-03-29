public class Main {
    public static void main(String[] args) {
        // Create some food items with base prices
        FoodItem burger = new BaseFoodItem("Burger", 5.99);
        FoodItem fries = new BaseFoodItem("Fries", 2.49);

        // Add toppings to the food items
        FoodItem burgerWithCheese = new Topping(burger, "Cheese", 1.00);
        FoodItem burgerWithBacon = new Topping(burger, "Bacon", 1.50);
        FoodItem friesWithSauce = new Topping(fries, "Sauce", 0.50);

        // Create an order
        Order order = new Order();
        order.addItem(burgerWithCheese);
        order.addItem(burgerWithBacon);
        order.addItem(friesWithSauce);

        // Calculate total cost without discount
        System.out.println("Total cost without discount: $" + order.calculateTotalCost());

        // Apply loyalty discount
        double totalCostWithDiscount = LoyaltyStatus.applyDiscount(order.calculateTotalCost(), 1);
        System.out.println("Total cost with loyalty discount: $" + Math.round(totalCostWithDiscount * 100.0) / 100.0);
    }
}
