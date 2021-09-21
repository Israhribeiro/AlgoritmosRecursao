package LinearSum;

public class LinearSumClass {
    public static int LinearSum(int[] A, int n){
        if(n == 1){
            return A[0];
        }else{
            return LinearSum(A, n - 1) + A[n - 1];
        }
    }

    public static void main(String[] args) {
        System.out.println(LinearSum(new int[]{1,2,3,4,5},5));
    }
}
