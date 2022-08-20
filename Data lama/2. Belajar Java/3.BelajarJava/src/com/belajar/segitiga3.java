package com.belajar;

import javax.print.DocFlavor;
import java.util.Scanner;

public class segitiga3 {
    public static void main(String[] args) {
            int alas;
            int tinggi;
            boolean looping = true;
            while (looping) {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukan Tinggi = ");
            tinggi = input.nextInt();
            System.out.print("Masukan Alas = ");
            alas = input.nextInt();
            int jum = 1;

            // tinggi dari segitiga
            for (int i = 1; i <= tinggi; i++) {
                // buat spasi di depan
                for (int s = tinggi - i; s > 0; s--) {
                    System.out.print(" ");
                }
                // buat baris
                for (int b = 1; b <= jum; b++) {
                    System.out.print("*");
                }
                System.out.println("");
                jum += 2;
            }
            System.out.println("Hasil dari luas segitiga adalah " + luasSegitiga(alas, tinggi));
            looping = getYesorNo("Apakah anda ingin melanjutkan?");
            }

    }
    private static int luasSegitiga (int alas, int tinggi){
        int hasil = (alas * tinggi) /2;
        return hasil;
    }
    private static boolean getYesorNo(String message){
        Scanner input = new Scanner(System.in);
        System.out.print("\n"+message+"[y/n]");
        String lanjutOrNo;
        lanjutOrNo = input.next();

        while (!lanjutOrNo.equalsIgnoreCase("y") && !lanjutOrNo.equalsIgnoreCase("n")){
            System.err.println("pilihan anda bukan y/n");
            System.out.print("\n"+message+"[y/n]");
            lanjutOrNo = input.next();
        }
        return  lanjutOrNo.equalsIgnoreCase("y");
    }

}