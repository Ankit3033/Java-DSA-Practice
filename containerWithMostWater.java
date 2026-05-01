package Array.TwoPointer;

public class containerWithMostWater {
    public static void main(String[] args) {

        int[] arr = {4,5,2,3,1};

        int container = containerWater(arr);
        System.out.println(container);
    }

    public static int containerWater(int[] arr){
        int n =arr.length;

        int left=0;
        int right =n-1;
        int maxArea =0;

        while(left<right){

            int length= Math.min(arr[left],arr[right]);
            int width = right-left;

            int area = length * width;
            maxArea = Math.max(area,maxArea);

            if(arr[left]<arr[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}
