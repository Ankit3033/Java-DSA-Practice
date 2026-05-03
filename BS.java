package Array.BinarySearch;

public class BS {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        int find = 5;

        int s =search(arr,find);
        if(s!=-1){
            System.out.println("Is Found at index: " + s);
        }else{
            System.out.println("Is Not Found");
        }
    }

    public static int search(int[] arr, int find){
        int n= arr.length;

        int left =0;
        int right =n-1;
        while(left <= right){
            int mid =left+(right-left)/2;

            if(arr[mid] == find){
                return mid;
            }else if(arr[mid] <find){
                left =mid+1;
            }else{
                right =mid-1;
            }
        }
        return -1;
    }
}
