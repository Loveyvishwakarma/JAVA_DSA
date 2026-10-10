//package JavaBasics.Loops;
//
//import java.util.Scanner;
//
//public class PrimeNumbers1ToN {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number you want to print prime numbers upto: ");
//        int number = sc.nextInt();
//        boolean isPrime = true;
//
//        if(number<=1){
//            isPrime = false;
//        }
//
//        for(int i = 2; i<=number; i++){
//            for(int j = 2; j<=number; j++){
//                if(i%j == 0){
//                    isPrime = false;
//                    break;
//                }
//            }
//            System.out.print(number + " ");
//        }
//
//        sc.close();
//    }
//}

package JavaBasics.Loops;

import java.util.Scanner;

public class PrimeNumbers1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number you want to print prime numbers upto: ");
        int number = sc.nextInt();

        for (int i = 2; i <= number; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
