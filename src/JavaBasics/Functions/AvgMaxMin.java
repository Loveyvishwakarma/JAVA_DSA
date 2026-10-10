package JavaBasics.Functions;

import java.util.Scanner;

public class AvgMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Subjects you have: ");
        int totalsubjects = sc.nextInt();
        int[] marks = new int[totalsubjects];

        System.out.println("Enter your marks in each subject: ");
        for(int i = 0; i<totalsubjects; i++){
            marks[i] = sc.nextInt();
        }

        System.out.println("Your Average is: " + Average(marks, totalsubjects));
        System.out.println("Your Maximum is: "+ Max(marks, totalsubjects));
        System.out.println("Your Minimum is: "+Min(marks, totalsubjects));
        System.out.println("Your Percentage is: "+ Percentage(marks, totalsubjects));
    }

    static int Average(int[] marks, int total){
        int sum = 0;

        for(int i =0; i<total; i++){
            sum += marks[i];
        }

        return sum/total;
    }

    static int Max(int[] marks, int total){
        int max = 0;
        for(int i = 0; i<total; i++){
            if(marks[i]>marks[max]){
                max = i;
            }
        }

        return marks[max];
    }

    static int Min(int[] marks, int total){
        int min = 0;
        for(int i = 0; i<total; i++){
            if(marks[i]<marks[min]){
                min = i;
            }
        }

        return marks[min];
    }

    static int Percentage(int[] marks, int total){
        int sum = 0;
        int totalmarks = total * 100;

        for(int i =0; i<total; i++){
            sum += marks[i];
        }

        return (sum/totalmarks)*100;
    }

}
