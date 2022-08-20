package com.belajar;

import java.util.Scanner;

public class segitiga2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int tinggi;
    int alas;
        System.out.print("Masukan Tinggi = ");
        tinggi  = input.nextInt();
        System.out.print("Masukan Alas = ");
        alas = input.nextInt();
        input.close();
        int jum = 1;

        // buat tinggi nya dulu
        for (int i = 1 ; i <= tinggi ; i++){
            // buat spasi
            for (int s = tinggi - i ; s > 0; s--){
                System.out.print(" ");
            }
            // buat barisnya
            for (int b = 1 ; b <= jum ; b++){
                if(b%2 ==0) {
                    System.out.print("_");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println("");
            jum += 2;
        }
        System.out.println("Luas dari segitiga adalah "+kelilingSegitiga(alas,tinggi)+ "cm");
    }
    private static int kelilingSegitiga(int alas, int tinggi){
        int hasil =  (alas*tinggi)/2;
        return hasil;
    }
}
