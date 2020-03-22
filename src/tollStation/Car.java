package tollStation;

public class Car {

   private static final double StartingPrice = 2.00;

    // may have a negative problem look into it// update fixed this problem
   public static double calculatedGasCost(double axel){
    return StartingPrice + ((axel - 3)*5) + ((axel * 1)- (axel - 2));
    }

    public static double calculatedEVCost(double axel){
        double EVdiscount = 0.50;
        double EVcost = StartingPrice + ((axel - 3) * 5) + ((axel * 1) - (axel - 2));
        return EVcost -
                ((EVcost) * EVdiscount);
    }

    public static double calculatedHybridCost(double axel){
        double hybridDiscount = 0.25;
        double hybridCost = StartingPrice + ((axel - 3) * 5) + ((axel * 1) - (axel - 2));
        return hybridCost -
                (hybridCost * hybridDiscount);
    }
}


