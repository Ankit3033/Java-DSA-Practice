package Array.TwoPointer;

import java.util.*;

public class threeSum {
    public static void main(String[] args) {

        int[] arr = {-1,0,1,2,-1,-4};
        int find =0;

        List<List<Integer>> list = tSum(arr,find);
        for( List<Integer> triplet: list){
            System.out.print(triplet + " ");
        }
    }

    public static List<List<Integer>> tSum(int[] arr ,int find){
        Arrays.sort(arr);
        Set<List<Integer>> set = new HashSet<>();

        for(int i=0; i<arr.length;i++){

            int left =i+1;
            int right =arr.length-1;

            while(left<right){
                int sum = arr[i] + arr[left] +arr[right];

                if(sum ==find){
                    set.add(Arrays.asList(arr[i],arr[left],arr[right]));
                    left++;
                    right--;
                }else if(find <sum){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
