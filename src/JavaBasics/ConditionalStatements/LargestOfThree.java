package JavaBasics.ConditionalStatements;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.print("Enter the third number: ");
        int c = sc.nextInt();

        if (a >= b) {
            if (a >= c) {
                System.out.println("First is the largest");
            } else {
                System.out.println("Third is the largest");
            }
        } else {
            if (b >= c) {
                System.out.println("Second is the largest");
            } else {
                System.out.println("Third is the largest");
            }
        }

        sc.close();
    }
}