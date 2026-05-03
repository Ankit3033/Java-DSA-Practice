package Array.BinarySearch;

public class searchInRotatedSortedArr {
    public static void main(String[] args) {

        int[] arr = {5,6,1,2,3,4};
        int find =6;

        int result = searchInRotated(arr,find);
        System.out.println(result);
    }

    public static int searchInRotated(int[] arr ,int find){

        int left =0;
        int right =arr.length-1;

        while(left <= right){
            int mid =left +(right-left)/2;

            if(arr[mid] ==find){
                return mid;
            }

            if(arr[left] <= arr[mid]){

                if(find >= arr[left] &&find <arr[mid]){
                    right =mid-1;
                }else{
                    left = mid+1;
                }

            }else{

                if(find >arr[mid] && find <= arr[right]){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
        }
        return -1;
    }
}
