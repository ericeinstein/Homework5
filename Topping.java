public class Topping extends ToppingDecorator {
    private String name;
    private double price;

    public Topping(FoodItem foodItem, String name, double price) {
        super(foodItem);
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return foodItem.getPrice() + price;
    }

    @Override
    public String toString() {
        return foodItem.toString() + " with " + name;
    }
}
