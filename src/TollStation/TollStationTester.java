package TollStation;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Random;

@SuppressWarnings("ALL")
public class TollStationTester {

    //simple money format
    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public static void main(String[] args) {

        //g constructor for a random number
        Random rand = new Random();
        //Total money made by the station as a whole
        double totalStationMade =0;

        System.out.println("Welcome to this toll station.");

        //first for loop is to create the number of booths at this station with the random generator between 0 and 5 can change the 2nd for loop is for the number of cars at each booth also using the random number generator from 0 to 10
        for (int numberOfBooths = rand.nextInt(5); numberOfBooths > 0; numberOfBooths--){

            System.out.println("There are/is "+numberOfBooths+" booth/booths at this station");
            TollBooth booth = new TollBooth();

            for (int numberOfCarsAtStation =rand.nextInt(10); numberOfCarsAtStation > 0; numberOfCarsAtStation--) {
                System.out.println("There are/is "+numberOfCarsAtStation+" car/cars at this booth ");

                // Three simple questions for user using their own scanners
                Scanner QuestionOne = new Scanner(System.in);
                System.out.println("How will you be paying cash, card or Es (Electronic system) ?");
                String paymentType = QuestionOne.nextLine();


                Scanner QuestionTwo = new Scanner(System.in);
                System.out.println("What kind of car do you drive gas, hybrid or EV ?");
                String carType = QuestionTwo.nextLine();


                Scanner QuestionThree = new Scanner(System.in);
                System.out.println("How many axel's does your car have ?");
                int axels = QuestionThree.nextInt();

                // nested if and els if for the answers from the questions above
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
            // quick accumulator for the totals
            TollBooth.totalBoothMade = TollBooth.totalCashMade
                    + TollBooth.totalCardMade + TollBooth.totalEsMade;
            totalStationMade =+ TollBooth.totalBoothMade;

            //print statements for totals at booth
            System.out.println("The total money made from cash transactions is $" + df2.format(TollBooth.totalCashMade));
            System.out.println("The total money made from card transactions is $" + df2.format(TollBooth.totalCardMade));
            System.out.println("The total money made from Es transactions is $" + df2.format(TollBooth.totalEsMade));
            System.out.println("The total money made from this booth is $"+ df2.format(TollBooth.totalBoothMade)+"\n");
        }
        //print statement for station total
        System.out.println("The total money made form this station is $"+ df2.format(totalStationMade));
    }
}
