package JavaBasics.Loops;

import java.util.Scanner;

public class GCDOfTwoNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        int n = Math.min(a,b);
        int gcd = 0;

        for(int i = 1; i<=n; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        System.out.println(gcd);
        sc.close();
    }
}
