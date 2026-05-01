package Array.TwoPointer;

public class pairWithGivenSum {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        int target = 12;

        boolean pS = isPairSum(arr,target);
        if(pS){
            System.out.println("Pair exists");
        }else{
            System.out.println("Pair not exists");
        }
    }

    public static boolean isPairSum(int[] arr, int target){

        if(arr == null || arr.length ==0){
            throw new IllegalArgumentException("Must not be empty");
        }

        int left =0;
        int right =arr.length-1;

        while(left<right){
            int sum = arr[left] + arr[right];
            if(sum ==target){
                return true;
            }else if(sum>target){
                right--;
            }else{
                left++;
            }
        }
        return false;
    }
}
