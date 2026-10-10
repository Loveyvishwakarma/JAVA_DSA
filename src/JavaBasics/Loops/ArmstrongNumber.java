package JavaBasics.Loops;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long original = n;

        long digit = 0;
        long count = 0;

        while(n>0){
            digit = n%10;
            count += (long) Math.pow(digit,3);
            n /=10;
        }

        if(count == original){
            System.out.println("It is a Armstrong number");
        }
        else{
            System.out.println("It is not an Armstrong number");
        }

        sc.close();
    }
}
