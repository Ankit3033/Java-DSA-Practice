package Array.BinarySearch;

public class squareRootOfNo {
    public static void main(String[] args) {

        int number = 12;

        int sq = squareRoot(number);
        System.out.println(sq);
    }

    public static int squareRoot(int n){

        int left =1;
        int right = n;
        int ans =0;

        while(left<=right){
            int mid =left+(right-left)/2;

            if((long)mid *mid == n){
                return mid;
            }else if((long)mid *mid < n){
                ans =mid;
                left =mid+1;
            }else{
                right =mid-1;
            }
        }
        return ans;
    }
}
