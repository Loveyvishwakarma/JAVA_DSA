package JavaBasics.PatternQuestions;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an even number of rows: ");
        int rows = sc.nextInt();

        if (rows < 2 || rows % 2 != 0) {
            System.out.println("Please enter an even number greater than or equal to 2.");
            sc.close();
            return;
        }

        int n = rows / 2;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = n-i; j >=1 ; j--) {
                System.out.print(" ");
            }

            for (int j = 2 * i - 1; j >= 1; j--) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }

}

