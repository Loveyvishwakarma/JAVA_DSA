package JavaBasics.Loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        n = Math.abs(n);

        int original = n;
        int digit = 0;
        int reverse= 0;

        while(n>0){
            digit = n%10;
            reverse = reverse*10+digit;
            n /=10;
        }

        if (reverse==original){
            System.out.println("It is a palindrome number");
        }
        else{
            System.out.println("It is not a palindrome number");
        }

        sc.close();
    }
}
