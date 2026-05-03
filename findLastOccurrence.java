package Array.BinarySearch;

public class findLastOccurrence {
    public static void main(String[] args) {

        int[] arr = {1,1,1,2,3,3,4,4,5,5};
        int find =1;

        int fo =findOcc(arr,find);
        System.out.println("Found at index at: " + fo);
    }

    public static int findOcc(int[] arr, int find){

        int left =0;
        int right =arr.length-1;

        int lastOcc = -1;
        while(left<=right){
            int mid = left+(right-left)/2;

            if(arr[mid] == find){
                lastOcc =mid;
                left =mid+1;
            }else if(arr[mid] <find){
                left =mid+1;
            }else{
                right =mid-1;
            }
        }
        return lastOcc;
    }
}
