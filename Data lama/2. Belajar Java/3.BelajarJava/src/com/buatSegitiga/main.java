package com.buatSegitiga;
import com.belajar.Switch;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        boolean lanjut = true;
        Scanner userInput = new Scanner(System.in);
        while (lanjut) {
        System.out.println("List Bentuk segitiga : ");
        System.out.println("\n 1. Segitiga sama Kaki" );
        System.out.println(" 2. Segitiga sama Siku kiri atas" );
        System.out.println(" 3. Segitiga sama Siku kiri bawah" );
        System.out.println(" 4. Segitiga sama Siku kanan" );
            System.out.print("\nPilih salah satu = ");
            String pilihanUser = userInput.next();
            System.out.print("\nMasukan Tinggi = ");
            int memasukanTinggi = userInput.nextInt();
            System.out.print("Masukan Alas = ");
            int memasukanAlas = userInput.nextInt();

            switch (pilihanUser) {
                case "1":
                    System.out.println("\n=================================");
                    System.out.println("Menampilkan Segigiga Sama kaki");
                    segitigaSamaKaki(memasukanTinggi);
                    System.out.println("\n* luas segitiga adalah " + luasSegitiga(memasukanAlas, memasukanTinggi));
                    System.out.println("* Keliling segitiga adalah " + kelilingSegitiga(memasukanAlas));
                    break;
                case "2":
                    System.out.println("=================================");
                    System.out.println("Menampilkan Segigiga Siku kiri atas");
                    segitigaSikuKiriAtas(memasukanTinggi);
                    System.out.println("\n* luas segitiga adalah " + luasSegitiga(memasukanAlas, memasukanTinggi));
                    System.out.println("* Keliling segitiga adalah " + kelilingSegitiga(memasukanAlas));
                    break;
                case "3":
                    System.out.println("=================================");
                    System.out.println("Menampilkan Segigiga Siku kiribawah");
                    segitigaSikuKiriBawah(memasukanTinggi);
                    System.out.println("\n* luas segitiga adalah " + luasSegitiga(memasukanAlas, memasukanTinggi));
                    System.out.println("* Keliling segitiga adalah " + kelilingSegitiga(memasukanAlas));
                    break;
                case "4":
                    System.out.println("=================================");
                    System.out.println("Menampilkan Segigiga Siku Kanan");
                    segitigaSikuKanan(memasukanTinggi);
                    System.out.println("\n* luas segitiga adalah " + luasSegitiga(memasukanAlas, memasukanTinggi));
                    System.out.println("* Keliling segitiga adalah " + kelilingSegitiga(memasukanAlas));
                    break;
                default:
                    System.err.println("Input anda tidak ditemukan,\nSilakan Pilih nomor [1-3]");
            }
            lanjut = getYesOrNo("Apakah anda ingin melanjutkan?");
            System.out.println("=========================================");
        }
    }
    private static void segitigaSamaKaki(int tinggi){
        for (int  i = 1 ; i <= tinggi ; i++){
            for (int s = tinggi - i; s>0 ; s--){
                System.out.print(" ");
            }
            for (int j = 1; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    private static void segitigaSikuKiriBawah(int tinggi) {
        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    private static void segitigaSikuKiriAtas(int tinggi) {
        for (int  i = 1 ; i <= tinggi ; i++){
            for (int j = tinggi; j>i ; j--){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    private static void segitigaSikuKanan(int tinggi) {
       for (int i = 1 ; i <= tinggi ; i++){
           for (int s = 2*(tinggi - i); s >0 ; s--){
               System.out.print(" ");
           }
           for (int j = 1 ; j <=i ; j++){
               System.out.print("* ");
           }
           System.out.println("");
        }
    }

    private static int luasSegitiga (int alas, int tinggi){
        int luas = 0 ;

        luas = (alas * tinggi) / 2;
        return luas;
    }
    private static int kelilingSegitiga (int alas){
     int keliling = 0;
     keliling = alas * 3;
     return keliling;
    }
    private static boolean getYesOrNo(String message) {
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\n"+message+"(y/n)");
        String pilihanUser;
        pilihanUser = terminalInput.next();

        while (!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")){
            System.err.println("Pilihan anda bukan y atau n");
            System.out.print("\n"+message+"(y/n)");
            pilihanUser = terminalInput.next();
        }
        switch (pilihanUser){
            case"n" :
                System.out.println("================END PROCESS==============");
        }
        return pilihanUser.equalsIgnoreCase("y");
    }
}
