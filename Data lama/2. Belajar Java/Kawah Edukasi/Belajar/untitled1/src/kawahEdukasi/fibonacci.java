package kawahEdukasi;

import java.util.Scanner;

public class fibonacci{
    public static void main (String [] args){
        int fn_1, fn_2,fn,n;

        Scanner input = new Scanner(System.in);
        System.out.print("Showing fibonacci data to- = ");
        n = input.nextInt();

        fn_1 = 1;
        fn_2 = 0;
        fn = 1;

        for (int i = 1 ; i <= n ; i++){
            System.out.println("data Fibonacci ke- "+i + " adalah "+ fn);
            fn = fn_1 +fn_2;
            fn_2 = fn_1;
            fn_1 = fn;
        }
    }
}
