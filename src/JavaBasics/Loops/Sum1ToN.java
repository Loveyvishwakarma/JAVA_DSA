package JavaBasics.Loops;

import java.util.Scanner;

public class Sum1ToN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to take the sum upto: ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 1; i<=n; i++){
            sum += i;
        }
        System.out.println(sum);

        sc.close();
    }
}
