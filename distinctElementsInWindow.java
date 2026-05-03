package Array.SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class distinctElementsInWindow {
    public static void main(String[] args) {

        int[] arr ={1,2,1,3,4,2,3};
        int k=3;

        List<Integer> l = distinct(arr,k);
        System.out.println(l);
    }

    public static List<Integer> distinct(int[] arr, int k){

        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();

        int left =0;
        for(int right =0; right<arr.length;right++){
            map.put(arr[right] ,map.getOrDefault(arr[right],0)+1);

            if(right-left+1 == k){
                list.add(map.size());

                map.put(arr[left],map.get(arr[left])-1);
                if(map.get(arr[left]) == 0){
                    map.remove(arr[left]);
                }
                left++;
            }
        }
        return list;
    }
}
