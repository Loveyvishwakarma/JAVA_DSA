package JavaBasics.ConditionalStatements;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        if(number>0){
            System.out.println("It is a positive number");
        }
        else if(number<0){
            System.out.println("It is a negative number");
        }
        else {
            System.out.println("It is zero");
        }
        sc.close();
    }
}
