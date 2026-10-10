package DSA.Practice.Arrays;

import java.util.ArrayList;

public class Snaketraversal {
    public static void main(String[] args){
        int[][] arr ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(traverse(arr));
    }

    static ArrayList<Integer> traverse(int[][] arr){

        ArrayList<Integer> list = new ArrayList<>();
        boolean flip = false;
        int top = 0;
        int bottom = arr.length -1;
        int left = 0;
        int right = arr[0].length -1;

        while(top<=bottom){
            if(!flip){
                for(int i = left; i<=right; i++){
                    list.add(arr[top][i]);
                }
                top++;
                flip = true;
            }
            else{
                if(top<=bottom){
                    for(int i = right; i>= left; i--){
                        list.add(arr[top][i]);
                    }
                    top++;
                    flip = false;
                }
            }
        }

        return list;
    }
}
