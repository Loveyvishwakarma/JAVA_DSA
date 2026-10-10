package JavaBasics.InputOutput;

import java.util.Scanner;

public class PrimitiveDataTypes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        byte a = sc.nextByte();
        short b = sc.nextShort();
        int c = sc.nextInt();
        long d = sc.nextLong();
        float e = sc.nextFloat();
        double f = sc.nextDouble();
        char g = sc.next().charAt(0);
        boolean h = sc.nextBoolean();

        System.out.println(a +" " + b +" "+ c +" "+ d +" "+ e +" "+ f +" "+ g +" "+ h);

        sc.close();
    }
}
