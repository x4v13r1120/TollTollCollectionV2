package tollStation;

public class TollBooth {
    public static double totalCashMade = 0;
    public static double totalCardMade = 0;
    public static double totalEsMade = 0;
    public static double totalBoothMade = 0;

    public static double totalCardCost(double carCost) {
        double cardFees = 0.15;
        return (carCost * cardFees) + carCost;
    }

    public static double totalESCost(double carCost) {
        double esdiscount = 0.20;
        return carCost - (carCost * esdiscount);
    }

    public static double totalCashCost(double carCost) {
        return carCost;
    }

}
