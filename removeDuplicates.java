package Array.TwoPointer;

public class removeDuplicates {
    public static void main(String[] args) {

        int[] arr = {1,1,2,3,4,4,4,5,6,6};

        int r = remove(arr);
        for(int i =0 ;i <r;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int remove(int[] arr){
        int n =arr.length;

        int i=0;
        for(int j=1;j<n;j++){

            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
}
