package JavaBasics.InputOutput;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println("The value of a is " + a + " and the value of b is " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("The value of a is " + a + " and the value of b is " + b);

        sc.close();
    }
}
