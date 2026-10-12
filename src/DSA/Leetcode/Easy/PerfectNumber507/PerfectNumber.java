package DSA.Leetcode.Easy.PerfectNumber507;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check: ");
        int n = sc.nextInt();
        int sum = 0;

        if(n<=1){
            System.out.println("It is not a perfect number");
            sc.close();
            return;
        }

        for(int i = 1; i<n; i++){
            if(n%i==0){
                sum = sum+i;
            }
        }

        if(sum == n){
            System.out.println("It is a perfect number");
        }else{
            System.out.println("It is not a perfect number");
        }

        sc.close();
    }
}
