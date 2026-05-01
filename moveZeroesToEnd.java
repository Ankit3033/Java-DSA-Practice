package Array.TwoPointer;

public class moveZeroesToEnd {
    public static void main(String[] args) {

        int[] arr = {0,1,0,2,3,0,4,5};

        moveZeroes(arr);
        for(int nums:arr){
            System.out.print(nums + " ");
        }
    }

    public static void moveZeroes(int[] arr){

        if(arr ==null || arr.length == 0){
            throw new IllegalArgumentException("Must not be empty");
        }

        int left =0;

        for(int right =0; right<arr.length; right++){
            if(arr[right] != 0){
                int temp =arr[right];
                arr[right] = arr[left];
                arr[left] = temp;

                left++;
            }
        }

    }
}
