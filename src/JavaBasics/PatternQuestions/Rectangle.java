package JavaBasics.PatternQuestions;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows you want: ");
        int rows = sc.nextInt();
        System.out.print("Enter the no of columns you want: ");
        int columns = sc.nextInt();

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
