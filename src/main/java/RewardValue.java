public class RewardValue {
    private final double cashValue;
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035; // Conversion rate from miles to cash

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    // Constructor that accepts miles value
    public RewardValue(int milesValue) {
        this.cashValue = milesValue * MILES_TO_CASH_CONVERSION_RATE; // Convert miles to cash
    }

    // Method to get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value
    public int getMilesValue() {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE); // Convert cash back to miles
    }
}
