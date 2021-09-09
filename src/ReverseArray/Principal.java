package ReverseArray;

import java.util.Arrays;

public class Principal {

    public static void main(String[] args){
        ReverseArray a = new ReverseArray();

        int[] b;

        b = new int[]{5, 4, 3, 2, 1};


        System.out.println(Arrays.toString(a.reverseArray(b, 0, 4)));


    }
}
