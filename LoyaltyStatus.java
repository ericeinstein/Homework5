public class LoyaltyStatus {
    public static double applyDiscount(double totalCost, int loyaltyLevel) {
        // Implement your discount logic here based on loyalty level
        switch (loyaltyLevel) {
            case 1:
                return totalCost * 0.9; // 10% discount for loyalty level 1
            case 2:
                return totalCost * 0.8; // 20% discount for loyalty level 2
            default:
                return totalCost;
        }
    }
}
