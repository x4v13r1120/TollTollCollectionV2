package TollStation;

public class TollBooth<carCost> {
    private static double Esdiscount = 0.20;
    private static double cardFees = 0.15;
    public static double totalCashMade = 0;
    public static double totalCardMade = 0;
    public static double totalEsMade = 0;
    public static double totalBoothMade = 0;

    public static double totalCardCost(double carCost) {
        return (carCost * cardFees) + carCost;
    }

    public static double totalESCost(double carCost) {
        return carCost - (carCost * Esdiscount);
    }

    public static double totalCashCost(double carCost) {
        return carCost;
    }

}
