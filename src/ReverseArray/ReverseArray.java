package ReverseArray;

import java.util.Arrays;

public class ReverseArray {
    public int[]  reverseArray(int[] A, int i, int j){
        if(i<j){
            int aux = A[i];
            A[i] = A[j];
            A[j] = aux;
            reverseArray(A,i+1,j-1);

        }
        return A;

    }




}
