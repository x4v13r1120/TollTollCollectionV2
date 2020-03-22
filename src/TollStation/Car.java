package TollStation;

public class Car {

   private static double StartingPrice = 2.00;

    // may have a negative problem look into it
   public static double calculatedGasCost(double axel){
    return StartingPrice + ((axel - 3)*5) + ((axel * 1)- (axel - 2));
    }

    public static double calculatedEVCost(double axel){
        double EVdiscount = 0.50;
        return StartingPrice + ((axel - 3)*5) +((axel * 1)- (axel - 2))-
                ((StartingPrice + ((axel - 3)*5) +((axel * 1)- (axel - 2)))* EVdiscount);
    }

    public static double calculatedHybridCost(double axel){
        double hybridDiscount = 0.25;
        return StartingPrice + ((axel - 3)*5) +((axel * 1)- (axel - 2))-
                ((StartingPrice + ((axel - 3)*5) +((axel * 1)- (axel - 2)))* hybridDiscount);
    }
}


