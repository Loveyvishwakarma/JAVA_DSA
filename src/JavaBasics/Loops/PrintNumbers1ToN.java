package JavaBasics.Loops;

import java.util.Scanner;

public class PrintNumbers1ToN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number until where you want to print: ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            System.out.println(i);
        }

        sc.close();
    }
}
