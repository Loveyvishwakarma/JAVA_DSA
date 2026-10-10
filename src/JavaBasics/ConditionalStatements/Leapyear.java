package JavaBasics.ConditionalStatements;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year you want to check: ");
        int year = sc.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("It is a leap year");
        } else {
            System.out.println("It is not a leap year");
        }

        sc.close();
    }
}
