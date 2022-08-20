package kawahEdukasi;

import java.util.Scanner;

public class no1 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukan diameter Lingkaran (cm)= ");
    int diameterLingkaran = input.nextInt();
    luasLingkaran(diameterLingkaran);
}
    private static void luasLingkaran(int diamater){
        float phi = 3.14f;

        float hasil = phi * diamater;
        System.out.println("Luas lingkaran adalah "+hasil);
        }
}


