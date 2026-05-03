package Array.BinarySearch;

public class peakElement {
    public static void main(String[] args) {

        int[] arr = {3,2,1,7,4,5};

        int p = peakNo(arr);
        System.out.println("Peak element is: " + p);

        int result = peak(arr);
        if(result ==-1){
            System.out.println("No Peak Element");
        }else{
            System.out.println("Peak element is: " + result);
        }
    }

    public static int peakNo(int[] arr){

        int left =0;
        int right = arr.length-1;

        while(left<right){
            int mid = left+(right-left)/2;

            if(arr[mid] < arr[mid+1]){
                left =mid+1;
            }else{
                right =mid;
            }
        }
        return left;
    }

    public static int peak(int[] arr){

        if(arr.length==0)return arr[0];
        if(arr.length ==2 && arr[0]>arr[1])return arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                return arr[i];
            }
        }

        if(arr[arr.length-1]>arr[arr.length-2])return arr[arr.length-1];
        return -1;
    }
}
