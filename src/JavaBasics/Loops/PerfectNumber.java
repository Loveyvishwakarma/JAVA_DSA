package JavaBasics.Loops;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int sum = 0;

        for(int i = 1; i<n; i++){
            if(n%i ==0){
                sum += i;
            }
        }

        if(n == sum){
            System.out.println("It is a Perfect number");
        }
        else{
            System.out.println("It is not a Perfect number");
        }

        sc.close();
    }
}
