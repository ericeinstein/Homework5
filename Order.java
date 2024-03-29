import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<FoodItem> items = new ArrayList<>();

    public void addItem(FoodItem item) {
        items.add(item);
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (FoodItem item : items) {
            totalCost += item.getPrice();
        }
        return totalCost;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Order:\n");
        for (FoodItem item : items) {
            sb.append("- ").append(item).append("\n");
        }
        sb.append("Total Cost: $").append(calculateTotalCost());
        return sb.toString();
    }
}
