//Hashmap
package DSA.Practice.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args){
        int[] arr = {1, 5, 3, 4, 2};
        int target = 7;

        System.out.println(Arrays.toString(twosum(arr, target)));
    }
    static int[] twosum(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int find = target - arr[i];

            if (map.containsKey(find)) {
                return new int[]{map.get(find), i};
            }
            map.put(arr[i], i);
        }

        return new int[]{-1,-1};
    }
}
