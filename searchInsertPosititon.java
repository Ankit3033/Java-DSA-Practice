package Array.BinarySearch;

public class searchInsertPosititon {
    public static void main(String[] args) {

        int[] arr = {1,2,4,5,6};
        int search = 3;

        int position =searchPosition(arr,search);
        System.out.println("Sahi Position hai: " + position);

    }

    public static int searchPosition(int[] arr ,int search){
        int n= arr.length;

        int left =0;
        int right =n-1;

        while(left<=right){
            int mid = left +(right-left)/2;

            if(arr[mid] == search){
                return mid;
            }else if(arr[mid] <search){
                left =mid+1;
            }else{
                right= mid-1;
            }
        }
        return left;
    }
}
