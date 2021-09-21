package LinearFibonacci;

public class LinearFibonacciClass {
    public static int[] LinearFibonacci(int k){
        if(k <= 1){
            return new int[]{k,0};
        }else{
            int[] A = LinearFibonacci(k-1);
            return new int[]{A[0] + A[1],A[0]};
        }
    }

    public static void main(String[] args){
        int[] A = LinearFibonacci(5);
        System.out.println(A[0] + "," + A[1]);
    }
}
