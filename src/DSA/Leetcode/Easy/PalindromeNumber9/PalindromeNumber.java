package DSA.Leetcode.Easy.PalindromeNumber9;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check if it's palindrome or not: ");
        int original = sc.nextInt();
        int n = original;
        long reverse=0;

        if(n<0){
            System.out.print("It is not a palindrome number");
            sc.close();
            return;
        }

        while(n>0){
            int digit = n%10;
            reverse = reverse*10+digit;
            n /= 10;
        }

        if(reverse == original){
            System.out.println("It is a palindrome number");
        }else{
            System.out.println("It is not a palindrome number");
        }

        sc.close();
    }
}
