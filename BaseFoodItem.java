public class BaseFoodItem implements FoodItem {
    private String name;
    private double basePrice;

    public BaseFoodItem(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    @Override
    public double getPrice() {
        return basePrice;
    }

    @Override
    public String toString() {
        return name;
    }
}
