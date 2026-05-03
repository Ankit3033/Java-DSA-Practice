package Array.SlidingWindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class firstNegativeNoInWindow {
    public static void main(String[] args) {

        int[] arr ={2,-1,-3,2,-5,-1};
        int k=3;

        List<Integer> result =firstNegative(arr,k);
        System.out.println(result);
    }

    public static List<Integer> firstNegative(int[] arr, int k){

        List<Integer> l =new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        int left =0;
        for(int right =0; right<arr.length;right++){

            if(arr[right] <0){
                q.add(arr[right]);
            }

            if(right-left+1 == k) {
                if (q.isEmpty()) {
                    l.add(0);
                } else {
                    l.add(q.peek());
                }

                if (!q.isEmpty() && arr[left] == q.peek()) {
                    q.poll();
                }
                left++;
            }
        }
        return l;
    }
}
