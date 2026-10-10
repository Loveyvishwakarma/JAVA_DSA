package JavaBasics.ConditionalStatements;

import java.util.Scanner;

public class CharacterType {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char ch = sc.next().charAt(0);

        if(Character.isUpperCase(ch)){
            System.out.println("It is uppercase letter");
        }
        else if (Character.isLowerCase(ch)) {
            System.out.println("It is lowercase letter");
        }
        else if (Character.isDigit(ch)) {
            System.out.println("It is a digit");
        }
        else{
            System.out.println("It is a special Character");
        }

        sc.close();
    }
}
