package kawahEdukasi;

import java.util.Locale;
import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Kata 1 = ");
        String kata1 = input.nextLine();
        System.out.print("Masukan Kata 2 = ");
        String kata2 = input.nextLine();
        String gabungan = kata1 +" "+ kata2;
        palindrom(gabungan);

    }
    private static void palindrom(String kata){
        String reverseStr = "";
        int strLength = kata.length();
        String kata2 = kata.toLowerCase();
        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr+ kata2.charAt(i);
        }
        if (kata2.equals(reverseStr)) {
            System.out.println(kata + " adalah Palindrom. ");
        }
        else {
            System.out.println(kata + " adalah bukan Palindrom. ");
        }
    }
}