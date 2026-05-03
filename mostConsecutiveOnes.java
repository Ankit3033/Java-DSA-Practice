package Array.SlidingWindow;

public class mostConsecutiveOnes {
    public static void main(String[] args) {

        int[] arr = {1,1,0,1,1,1};

        int m = mostConsecutive(arr);
        System.out.println(m);
    }

    public static int mostConsecutive(int[] arr){

        int left =0;
        int maxLen =0;

        for(int right =0; right<arr.length;right++){

            if(arr[right] ==1){
                maxLen = Math.max(maxLen,right-left+1);
            }else{
                left = right+1;
            }
        }
        return maxLen;
    }
}
