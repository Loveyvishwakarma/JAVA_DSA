package JavaBasics.PatternQuestions;

import java.util.Scanner;

public class RightAlignedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows you want: ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print("  ");
            }

            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();
    }
}
