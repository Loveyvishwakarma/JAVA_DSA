package JavaBasics.InputOutput;

import java.util.Scanner;

public class PersonalIntroduction {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        String place = sc.next();

        System.out.println("My name is: " + name);
        System.out.println("My age is: "+ age);
        System.out.println("I live in: " + place);

        sc.close();
    }
}
