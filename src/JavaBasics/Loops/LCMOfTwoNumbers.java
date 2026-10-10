package JavaBasics.Loops;

import java.util.Scanner;

public class LCMOfTwoNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        int n = Math.max(a,b);
        int lcm = 0;

        for(int i = n; true; i++){
            if(i%a == 0 && i%b == 0){
                lcm = i;
                break;
            }
        }


        System.out.println(lcm);
        sc.close();
    }
}
