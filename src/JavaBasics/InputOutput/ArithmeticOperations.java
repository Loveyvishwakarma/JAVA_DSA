package JavaBasics.InputOutput;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println("Their sum is "+ (a+b));
        System.out.println("Their difference is "+ (a-b));
        System.out.println("Their product is "+ (a*b));
        System.out.println("Their quotient and remainder are "+ (a/b)+" "+(a%b));

        sc.close();
    }
}
