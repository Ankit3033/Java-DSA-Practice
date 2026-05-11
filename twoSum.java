package HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        int target = 11;

        int[] pair = tSum(arr,target);
        System.out.println(Arrays.toString(pair));
    }

    public static int[] tSum(int[] arr, int target){

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){

            int find = target - arr[i];

            if(map.containsKey(find)){
                return new int[]{map.get(find),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
}
