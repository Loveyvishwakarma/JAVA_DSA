package DSA.Practice.Arrays;

public class SecondLargestofanArray {
    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 3, 5, 723, 57, 2, 9};
        int largest = arr[0];
        int SecondLargest = arr[0];
        int minimum = arr[0];

        for(int i = 1; i<arr.length; i++){
            if(arr[i]> largest){
                SecondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > SecondLargest && arr[i] != largest){
                SecondLargest = arr[i];
            }
            else{
                if(arr[i]<minimum){
                    minimum = arr[i];
                }
            }
        }

        System.out.println("The Largest value is: " + largest);
        System.out.println("The SecondLargest value is: " + SecondLargest);
        System.out.println("The minimum value is: " + minimum);

    }
}
