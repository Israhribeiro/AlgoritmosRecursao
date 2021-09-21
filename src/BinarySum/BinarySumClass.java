package BinarySum;

public class BinarySumClass {
    public static int BinarySum(int[] A, int i, int n) {
        if(n == 1){
            return A[i];
        }
        return BinarySum(A, i, (int) Math.ceil(n/2)) + BinarySum(A, i + (int) Math.ceil(n/2), (int) Math.floor(n/2));
    }

    public static void main(String[] args){
        int[] A = new int[] {1,2,3,4,5};
        System.out.println(BinarySum(A,0,5));
    }

}
