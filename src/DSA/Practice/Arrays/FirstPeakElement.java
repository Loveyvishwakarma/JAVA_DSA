package DSA.Practice.Arrays;
//do this using normal for loop
public class FirstPeakElement {
    public static void main(String[] args){
        int[] arr = {1,5,2,4,3,6,4,8,7};

        int left= 0;
        int right = arr.length-1;

        while(left<right){
            int mid = left+ (right-left)/2;

            if(arr[mid]<arr[mid+1]){
                left = mid+1;
                break;
            }
            else{
                right = mid;
            }
        }

        System.out.println(right);
    }
}


//first peak
//last peak
//count of peak