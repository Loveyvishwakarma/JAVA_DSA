package JavaBasics.InputOutput;

import java.util.Scanner;

public class SwapWithoutTemp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the Second number: ");
        int b = sc.nextInt();

        System.out.println("The value of a is "+a+" and the value of b is "+b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("The value of a is "+a+" and the value of b is "+b);

        sc.close();
    }
}
