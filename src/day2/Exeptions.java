package day2;

import java.util.Scanner;

public class Exeptions {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter two number");
        int number1=scan.nextInt();
        int number2=scan.nextInt();

        int division= 0;
        try {
            division = number1/number2;
            System.out.println(division);
        } catch (ArithmeticException e) {
            System.out.println("You should enter a number except 0");
        }



    }
}
