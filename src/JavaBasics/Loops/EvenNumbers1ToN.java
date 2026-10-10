package JavaBasics.Loops;

import java.util.Scanner;

public class EvenNumbers1ToN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to print: ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            if(i%2 == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
