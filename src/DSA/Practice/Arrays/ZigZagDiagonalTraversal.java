package DSA.Practice.Arrays;

import java.util.ArrayList;

public class ZigZagDiagonalTraversal {
    public static void main(String[] args){
        int[][] arr ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(traverse(arr));
    }

    static ArrayList<Integer> traverse (int[][] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length -1;
        int m = arr[0].length -1;
        boolean flip = false;
        int k=0;
        while(k<m+n-1){
            if(!flip){
                for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++) {
                        if (i + j == k) {
                            list.add(arr[i][j]);
                        }
                        k++;
                        flip = true;
                    }
                }
            }else{
                for (int i=m-1;i>=0;i--){
                    for(int j=n-1;j>=0;j--){
                        if(i+j==k){
                            list.add(arr[i][j]);
                        }
                    }
                }
            }
            k++;
            flip= false;
        }
        return list;
    }
}
