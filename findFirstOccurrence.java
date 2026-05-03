package Array.BinarySearch;

public class findFirstOccurrence {
    public static void main(String[] args) {

        int[] arr = {1,1,2,2,3,3,4,5,6};
        int find =1;

        int fo =firstOcc(arr,find);
        System.out.println("Found at index: " + fo);
    }

    public static int firstOcc(int[] arr, int find){
        int n =arr.length;

        int left =0;
        int right =n-1;

        int fOcc =-1;
        while(left<=right){
            int mid = left+(right-left)/2;

            if(arr[mid] == find){
                fOcc = mid;
                right=mid-1;
            }else if(arr[mid] <find){
                left =mid+1;
            }else{
                right = mid-1;
            }
        }
        return fOcc;
    }
}
