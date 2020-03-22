package TollStation;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Random;

public class TollStationTester {

    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public static void main(String[] args) {
        Random rand = new Random();

        double totalStationMade =0;

        System.out.println("Welcome to this toll station.");
        for (int numberOfBooths = rand.nextInt(5); numberOfBooths > 0; numberOfBooths--){
            System.out.println("There are/is "+numberOfBooths+" booth/booths at this station");
            TollBooth booth = new TollBooth();
            for (int numberOfCarsAtStation =rand.nextInt(10); numberOfCarsAtStation > 0; numberOfCarsAtStation--) {
                System.out.println("There are/is "+numberOfCarsAtStation+" car/cars at this booth ");
                Scanner QuestionOne = new Scanner(System.in);

                System.out.println("How will you be paying cash, card or Es (Electronic system) ?");
                String paymentType = QuestionOne.nextLine();


                Scanner QuestionTwo = new Scanner(System.in);
                System.out.println("What kind of car do you drive gas, hybrid or EV ?");
                String carType = QuestionTwo.nextLine();


                Scanner QuestionThree = new Scanner(System.in);
                System.out.println("How many axel's does your car have ?");
                int axels = QuestionThree.nextInt();


                if (carType.equals("gas")) {
                        double carCost = Car.calculatedGasCost(axels);
                        if (paymentType.equals("cash")){
                            System.out.println("Your car's cost is $"+ df2.format(TollBooth.totalCashCost(carCost)));
                            TollBooth.totalCashMade =+ TollBooth.totalCashCost(carCost);
                        }else if(paymentType.equals("card")){
                            System.out.println("Your car's cost is $"+ df2.format(TollBooth.totalCardCost(carCost)));
                            TollBooth.totalCardMade =+ TollBooth.totalCardCost(carCost);
                        }else if(paymentType.equals("Es")){
                            System.out.println("Your car's cost is $"+ df2.format(TollBooth.totalESCost(carCost)));
                            TollBooth.totalEsMade =+ TollBooth.totalESCost(carCost);
                        }else{
                            System.out.println("Invalid inout please try again.");
                        }
                } else if (carType.equals("hybrid")) {
                        double carCost = Car.calculatedHybridCost(axels);
                        if (paymentType.equals("cash")){
                            System.out.println("Your car's cost is $"+ df2.format(TollBooth.totalCashCost(carCost)));
                            TollBooth.totalCashMade =+ TollBooth.totalCashCost(carCost);
                        }else if(paymentType.equals("card")){
                            System.out.println("Your car's cost is $"+ df2.format(TollBooth.totalCardCost(carCost)));
                            TollBooth.totalCardMade =+ TollBooth.totalCardCost(carCost);
                        }else if(paymentType.equals("Es")){
                            System.out.println("Your car's cost is $"+ df2.format(TollBooth.totalESCost(carCost)));
                            TollBooth.totalEsMade =+ TollBooth.totalESCost(carCost);
                        }else {
                            System.out.println("Invalid inout please try again.");
                        }
                } else if (carType.equals("EV")) {
                        double carCost = Car.calculatedEVCost(axels);
                        if (paymentType.equals("cash")){
                            System.out.println("Your car's cost is $"+ df2.format(TollBooth.totalCashCost(carCost)));
                            TollBooth.totalCashMade =+ TollBooth.totalCashCost(carCost);
                        }else if(paymentType.equals("card")){
                            System.out.println("Your car's cost is $"+ df2.format(TollBooth.totalCardCost(carCost)));
                            TollBooth.totalCardMade =+ TollBooth.totalCardCost(carCost);
                        }else if(paymentType.equals("Es")){
                            System.out.println("Your car's cost is $"+ df2.format(TollBooth.totalESCost(carCost)));
                            TollBooth.totalEsMade =+ TollBooth.totalESCost(carCost);
                        }else{
                            System.out.println("Invalid input please try again.");
                        }
                } else {
                    System.out.println("Invalid input please try again.");
                }
            }
            TollBooth.totalBoothMade = TollBooth.totalCashMade
                    + TollBooth.totalCardMade + TollBooth.totalEsMade;
            totalStationMade =+ TollBooth.totalBoothMade;
            System.out.println("The total money made from cash transactions is $" + df2.format(TollBooth.totalCashMade));
            System.out.println("The total money made from card transactions is $" + df2.format(TollBooth.totalCardMade));
            System.out.println("The total money made from Es transactions is $" + df2.format(TollBooth.totalEsMade));
            System.out.println("The total money made from this booth is $"+ df2.format(TollBooth.totalBoothMade)+"\n");
        }
        System.out.println("The total money made form this station is $"+ df2.format(totalStationMade));
    }
}
