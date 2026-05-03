package Array.BinarySearch;

public class ceilInSortedArr {
    public static void main(String[] args) {

        int[] arr = {1,3,5,6,7};
        int find  =4;

        int result =ceil(arr,find);
        System.out.println("Ceil of value is: " + arr[result]);
    }

    public static int ceil(int[] arr ,int find){
        int n= arr.length;

        int left =0;
        int right =n-1;

        while(left<=right){
            int mid =left +(right-left)/2;

            if(arr[mid] == find){
                return mid;
            }else if(arr[mid] <find){
                left =mid+1;
            }else{
                right =mid-1;
            }
        }
        return left;
    }
}
