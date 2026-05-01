package Array.TwoPointer;

public class reverseArray {
    public static void main(String[] args) {

        int[] arr = {6,5,4,3,2,1};

        reverse(arr);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverse(int[] arr){
        if(arr ==null || arr.length ==0){
            throw new IllegalArgumentException("Must not be empty");
        }

        int first =0;
        int last = arr.length-1;

        while(first <last){

            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
    }
}
