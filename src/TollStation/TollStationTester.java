package TollStation;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Random;

public class TollStationTester {

    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("Welcome to this toll station.");
        for (int numberOfBooths = rand.nextInt(3); numberOfBooths > 0; numberOfBooths--){
            for (int numberOfCarsAtStation =rand.nextInt(5); numberOfCarsAtStation > 0; numberOfCarsAtStation--) {
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
                        }else if(paymentType.equals("card")){
                            System.out.println("Your car's cost is $"+ df2.format(TollBooth.totalCardCost(carCost)));
                        }else if(paymentType.equals("Es")){
                            System.out.println("Your car's cost is $"+ df2.format(TollBooth.totalESCost(carCost)));
                        }else{
                            System.out.println("Invalid inout please try again.");
                        }
                } else if (carType.equals("hybrid")) {
                        double carCost = Car.calculatedHybridCost(axels);
                        if (paymentType.equals("cash")){
                            System.out.println("Your car's cost is $"+ df2.format(TollBooth.totalCashCost(carCost)));
                        }else if(paymentType.equals("card")){
                            System.out.println("Your car's cost is $"+ df2.format(TollBooth.totalCardCost(carCost)));
                        }else if(paymentType.equals("Es")){
                            System.out.println("Your car's cost is $"+ df2.format(TollBooth.totalESCost(carCost)));
                        }else {
                            System.out.println("Invalid inout please try again.");
                        }
                } else if (carType.equals("EV")) {
                        double carCost = Car.calculatedEVCost(axels);
                        if (paymentType.equals("cash")){
                            System.out.println("Your car's cost is $"+ df2.format(TollBooth.totalCashCost(carCost)));
                        }else if(paymentType.equals("card")){
                            System.out.println("Your car's cost is $"+ df2.format(TollBooth.totalCardCost(carCost)));
                        }else if(paymentType.equals("Es")){
                            System.out.println("Your car's cost is $"+ df2.format(TollBooth.totalESCost(carCost)));
                        }else{
                            System.out.println("Invalid inout please try again.");
                        }
                } else {
                    System.out.println("Invalid input please try again.");
                }
            }
        }
    }
    public static double getRandomIntegerBetweenRange(double min, double max){
        return (int)(Math.random()*((max-min)+1))+min;

    }
}
