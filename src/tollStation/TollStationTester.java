/*
  Author_Xavier_Naranjo
  Start_Date_03/16/2020 End_Date_03/22/2019
  This is a upgraded project for another toll station collection software I wrote for class.
  Uses a random number generator for the number of booths at the station and the number of cars at each booth.
  Then asks user the car type the payment type and number of axel's the car has and tells the user the price
  With any discounts or fees applied.It also displays the total made by each booth and by the entire station.
 */
package tollStation;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Random;


public class TollStationTester {

    //simple money format
    private static final DecimalFormat df2 = new DecimalFormat("#.##");

    public static void main(String[] args) {

        //g constructor for a random number
        Random rand = new Random();
        //Total money made by the station as a whole
        double totalStationMade =0;

        System.out.println("Welcome to this toll station.");

        //first for loop is to create the number of booths at this station with the random generator between 0 and 5 can change the 2nd for loop is for the number of cars at each booth also using the random number generator from 0 to 10
        for (int numberOfBooths = rand.nextInt(5); numberOfBooths > 0; numberOfBooths--){

            System.out.println("There are/is "+numberOfBooths+" booth/booths at this station");

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

                // switch and case and nested if and else if for the answers from the questions above as well as if cost is below zero user has no car cost
                switch (carType) {
                    case "gas": {
                        double carCost = Car.calculatedGasCost(axels);
                        switch (paymentType) {
                            case "cash":
                                TollBooth.totalCashMade = +TollBooth.totalCashCost(carCost);
                                if (TollBooth.totalCashCost(carCost) < 0) {
                                    System.out.println("You owe nothing, discounts have made your price $0 or lower please proceed thank you.");
                                }else{
                                    System.out.println("Your car's cost is $" + df2.format(TollBooth.totalCashCost(carCost)));
                                }
                                break;
                            case "card":
                                TollBooth.totalCardMade = +TollBooth.totalCardCost(carCost);
                                if (TollBooth.totalCardCost(carCost) < 0) {
                                    System.out.println("You owe nothing, discounts have made your price $0 or lower please proceed thank you.");
                                }else{
                                    System.out.println("Your car's cost is $" + df2.format(TollBooth.totalCardCost(carCost)));
                                }
                                break;
                            case "Es":
                                TollBooth.totalEsMade = +TollBooth.totalESCost(carCost);
                                if (TollBooth.totalESCost(carCost) < 0) {
                                    System.out.println("You owe nothing, discounts have made your price $0 or lower please proceed thank you.");
                                }else{
                                    System.out.println("Your car's cost is $" + df2.format(TollBooth.totalESCost(carCost)));
                                }
                                break;
                            default:
                                System.out.println("Invalid inout please try again.");
                                break;
                        }
                        break;
                    }
                    case "hybrid": {
                        double carCost = Car.calculatedHybridCost(axels);
                        switch (paymentType) {
                            case "cash":
                                TollBooth.totalCashMade = +TollBooth.totalCashCost(carCost);
                                if (TollBooth.totalCashCost(carCost) < 0) {
                                    System.out.println("You owe nothing, discounts have made your price $0 or lower please proceed thank you.");
                                }else{
                                    System.out.println("Your car's cost is $" + df2.format(TollBooth.totalCashCost(carCost)));
                                }
                                break;
                            case "card":
                                TollBooth.totalCardMade = +TollBooth.totalCardCost(carCost);
                                if (TollBooth.totalCardCost(carCost) < 0) {
                                    System.out.println("You owe nothing, discounts have made your price $0 or lower please proceed thank you.");
                                }else{
                                    System.out.println("Your car's cost is $" + df2.format(TollBooth.totalCardCost(carCost)));
                                }
                                break;
                            case "Es":
                                TollBooth.totalEsMade = +TollBooth.totalESCost(carCost);
                                if (TollBooth.totalESCost(carCost) < 0) {
                                    System.out.println("You owe nothing, discounts have made your price $0 or lower please proceed thank you.");
                                }else{
                                    System.out.println("Your car's cost is $" + df2.format(TollBooth.totalESCost(carCost)));
                                }
                                break;
                            default:
                                System.out.println("Invalid inout please try again.");
                                break;
                        }
                        break;
                    }
                    case "EV": {
                        double carCost = Car.calculatedEVCost(axels);
                        switch (paymentType) {
                            case "cash":
                                TollBooth.totalCashMade = +TollBooth.totalCashCost(carCost);
                                if (TollBooth.totalCashCost(carCost) < 0) {
                                    System.out.println("You owe nothing, discounts have made your price $0 or lower please proceed thank you.");
                                }else{
                                    System.out.println("Your car's cost is $" + df2.format(TollBooth.totalCashCost(carCost)));
                                }
                                break;
                            case "card":
                                TollBooth.totalCardMade = +TollBooth.totalCardCost(carCost);
                                if (TollBooth.totalCardCost(carCost) < 0) {
                                    System.out.println("You owe nothing, discounts have made your price $0 or lower please proceed thank you.");
                                }else{
                                    System.out.println("Your car's cost is $" + df2.format(TollBooth.totalCardCost(carCost)));
                                }
                                break;
                            case "Es":
                                TollBooth.totalEsMade = +TollBooth.totalESCost(carCost);
                                if (TollBooth.totalESCost(carCost) < 0) {
                                    System.out.println("You owe nothing, discounts have made your price $0 or lower please proceed thank you.");
                                }else{
                                    System.out.println("Your car's cost is $" + df2.format(TollBooth.totalESCost(carCost)));
                                }
                                break;
                            default:
                                System.out.println("Invalid input please try again.");
                                break;
                        }
                        break;
                    }
                    default:
                        System.out.println("Invalid input please try again.");
                        break;
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
        System.out.println("The total money made from this station is $"+ df2.format(totalStationMade));
        }

    }

