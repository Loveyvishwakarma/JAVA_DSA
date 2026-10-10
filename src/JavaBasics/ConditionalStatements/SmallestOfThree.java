package JavaBasics.ConditionalStatements;

import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int a = sc.nextInt();
        System.out.println("Enter your second number: ");
        int b = sc.nextInt();
        System.out.println("Enter your third number: ");
        int c = sc.nextInt();

        if (a <= b) {
            if (a <= c) {
                System.out.println("a is the smallest");
            } else {
                System.out.println("c is the smallest");
            }
        } else {
            if (b <= c) {
                System.out.println("b is the smallest");
            } else {
                System.out.println("c is the smallest");
            }
        }

        sc.close();
    }
}
