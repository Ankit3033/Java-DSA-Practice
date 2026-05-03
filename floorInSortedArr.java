package Array.BinarySearch;

public class floorInSortedArr {
    public static void main(String[] args) {

        int[] arr = {1,2,4,5,8,9};
        int find = 3;

        int result = findFloor(arr,find);
        System.out.println("Floor value is: " + result);
    }

    public static int findFloor(int[] arr ,int find){
        int n= arr.length;

        int left =0;
        int right =n-1;

        while(left<=right){
            int mid = left + (right-left)/2;

            if(arr[mid] == find){
                return arr[mid];
            }
            else if(arr[mid] < find){

                left =mid+1;
            }else{
                right =mid-1;
            }
        }
        return arr[right];
    }
}

