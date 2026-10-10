package JavaBasics.Loops;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check is prime: ");
        int n = sc.nextInt();
        boolean isPrime = true;

        if(n<=1){
            isPrime = false;
        }

        for(int i = 2; i<n; i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);
        sc.close();
    }
}
