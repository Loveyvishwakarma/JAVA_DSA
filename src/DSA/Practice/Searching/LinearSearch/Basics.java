package DSA.Practice.Searching.LinearSearch;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to find: ");
        int target = sc.nextInt();

        System.out.print("Enter the Array length you want to find the element in: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the Array element: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<n; i++){
            if(arr[i] == target){
                System.out.println("The element we fount at "+ i +" index is "+ target);
            }
        }
    }
}

//you can do better gurl!!!!!!!