package RecursiveFactorial;

public class RecursiveFactorial {
    public static int recursviveFactorial(int n) {
        if(n == 0){
            return 1;
        }else{
            return n * recursviveFactorial(n-1);
        }

    }

    public static void  main (String[] args){
        int teste = recursviveFactorial(5);

        System.out.println(teste);
    };
}
