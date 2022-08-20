package kawahEdukasi;

import java.util.Arrays;
import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Kata 1 = ");
        String kata1 = input.next();
        System.out.print("Masukan Kata 2 = ");
        String kata2 = input.next();

        perbandingan(kata1,kata2);
    }

    private static void perbandingan(String kata1, String kata2) {
    if (kata1.length() >  kata2.length()){
        System.out.println("kata 1 lebih besar "+(kata1.length()-kata2.length()));
    } else if (kata1.length()< kata2.length()) {
        System.out.println("Kata 2 lebih besar " + (kata1.length()-(kata2.length()) ));
    } else if (kata1.length()== kata2.length()) {
        System.out.println("Kata 1 dan Kata 2 sama besar ");
    }
    }

}
