package IterativeReverseArray;

import java.util.Arrays;

public class Principal {
    public static void main(String[] args){
        interativeReverseArray a = new interativeReverseArray();
        int [] b = new int[]{5,4,3,2,1};

        System.out.println(Arrays.toString(a.iterativeReverseArray(b, 0, 4)));
    }
}
