package JavaBasics.InputOutput;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the degrees in Celsius: ");
        float Celsius = sc.nextFloat();

        double Fahrenheit = (Celsius*1.8)+32;

        System.out.println("The degrees in Fahrenheit is: "+ Fahrenheit);
        sc.close();
    }
}
