package JavaBasics.Loops;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int digit = 0;
        int reverse = 0;

        while(n>0){
            digit = n%10;
            reverse = reverse*10+digit;
            n /= 10;
        }

        System.out.println(reverse);
        sc.close();
    }
}
