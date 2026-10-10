package JavaBasics.PatternQuestions;

import java.util.Scanner;

public class CharPattern {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows you want to print: ");
        int n = sc.nextInt();
        char ch = 'A';

        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
