package JavaBasics.InputOutput;

import java.util.Scanner;

public class TotalCost {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of one unit purchased: ");
        double a = sc.nextDouble();
        System.out.print("Enter the no of units purchased: ");
        int b = sc.nextInt();

        double cost = a*b;

        System.out.println("The total cost of the product is: "+ cost);
        sc.close();
    }
}
