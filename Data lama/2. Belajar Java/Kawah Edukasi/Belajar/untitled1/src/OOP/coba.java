package OOP;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class coba {
    public static void main(String[] args) {
        String kata1, kata2;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Kata 1 = ");
        kata1 = input.nextLine();
        System.out.print("Masukan Kata 2 = ");
        kata2 = input.nextLine();
        String comb = kata1.toLowerCase()+" "+kata2.toLowerCase();
        String str="" ;

        for (int i=0; i< comb.length(); i++){
            str = str.toLowerCase() + comb.charAt(i);
        }
        if ( comb.equals(str)){
            System.out.println(kata1+" "+ kata2 + " its Palindrome");
        }else{
            System.out.println(kata1+" "+ kata2 + comb + " its not palindrome");
        }
    }
}




















