package JavaBasics.InputOutput;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of length: ");
        double length = sc.nextDouble();
        System.out.print("Enter the value of breadth: ");
        double breadth = sc.nextDouble();

        double area = length*breadth;
        double perimeter = 2*(length+breadth);

        System.out.println("The area of rectangle is "+ area +" and the perimeter of rectangle is "+perimeter);
        sc.close();
    }
}
