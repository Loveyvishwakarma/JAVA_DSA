package DSA.Practice.Arrays;

public class MinAndMaxinanArray {
    public static void main(String[] args){
        int[] arr = {7,8,1,3,5,723,57,2,9};
        int min = arr[0];
        int max = arr[0];

        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            else{
                if (arr[i]<min){
                    min = arr[i];
                }
            }
        }

        System.out.println("Maximum element is: "+ max);
        System.out.println("Minimum element is: "+ min);
    }
}
