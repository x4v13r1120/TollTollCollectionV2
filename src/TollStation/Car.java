package TollStation;

public class Car<axel> {

   private static double StartingPrice = 2.00;
   private static double EVdiscount = 0.50;
   private static double hybridDiscount= 0.25;

   public static double calculatedGasCost(double axel){
    return StartingPrice + ((axel - 3)*5) + ((axel * 1)- (axel - 2));
    }

    public static double calculatedEVCost(double axel){
        return StartingPrice + ((axel - 3)*5) +((axel * 1)- (axel - 2))-
                ((StartingPrice + ((axel - 3)*5) +((axel * 1)- (axel - 2)))* EVdiscount);
    }

    public static double calculatedHybridCost(double axel){
        return StartingPrice + ((axel - 3)*5) +((axel * 1)- (axel - 2))-
                ((StartingPrice + ((axel - 3)*5) +((axel * 1)- (axel - 2)))* hybridDiscount);
    }
}


