package BinaryFib;

public class BinaryFibonacciClass {
    public static int BinaryFibonacci(int k){
        if(k <= 1){
            return k;
        }else{
            return BinaryFibonacci(k-1) + BinaryFibonacci(k-2);
        }
    }
    public static void main(String args[]){
        System.out.println(BinaryFibonacci(5));
    }
}
