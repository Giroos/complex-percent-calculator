package com.gena;

public class Main {

    //calc with IRA tax
    //calc with regular tax
    //calc with random percent
    //calc for robot portfolio
    //calc for pension plan

    public static void main(String[] args) {
        int years = 15;
        double percent = 20;
        double monthlyDeposit = 1500;

        double sum = 90000;

        double v = calcIRA(16, 20, 90000, 1500);
        double v1 = calcIRA(14, 20, 50000, 1000);
        double v2 = calcIRA(13, 20, 60000, 4000);

        System.out.println(v+v1+v2);


    }

    public static double calcIRA(int years, double percent, double initialSum, double monthlyDeposit){

        double totalDeposit = initialSum;
        System.out.println("-----------------------------------------------------");
        for (int i = 1; i <= years; i++){
            double yearlyDeposit = monthlyDeposit * 12;
            totalDeposit = totalDeposit + yearlyDeposit;
            initialSum = initialSum + (initialSum * (percent / 100));
            initialSum = initialSum + yearlyDeposit;

            System.out.println("YEAR: " + i + " SUM: " + initialSum);

        }
        double amountForTax = initialSum - totalDeposit;
        double tax = amountForTax * 0.25;
        return initialSum - tax;
    }
}
