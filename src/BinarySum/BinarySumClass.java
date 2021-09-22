package BinarySum;

public class BinarySumClass {
    public static int binarySum(int[] data, int low, int high){

            if(low > high)
                return 0;
            else if(low == high)
                return data[low] ;// there is only one element in the array
            else {
                int mid = (low + high)/2;
                return binarySum(data, low, mid) + binarySum(data, mid+1, high);
            }
    }

    public static void main(String[] args){
        int[] A = new int[] {1,2,3,4,5};
        System.out.println(binarySum(A,0,5));
    }

}
