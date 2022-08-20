package com.buatSegitiga;

import jdk.dynalink.beans.StaticClass;

import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.util.Scanner;

public class buatSegitiga2 {
    public static void main(String[] args) {
        Scanner pilihanUser = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            mainMenu();
            System.out.print("Pilih menu = ");
            String inputUser = pilihanUser.next();
            System.out.print("Masukan tinggi = ");
            int tinggi = pilihanUser.nextInt();
            exception(tinggi);
            actMenu(inputUser,tinggi);
            loop = getYesOrNo("Apakah anda ingin Melanjutkan? ");
        }
    }
    private static void mainMenu(){
        System.out.println("==================================");
        System.out.println("Berikut List Segitiga");
        System.out.println("\n1. Segitiga sama kaki");
        System.out.println("2. Segitiga sama siku Kiri bawah");
        System.out.println("3. Segitiga sama siku Kiri Atas");
        System.out.println("4. Segitiga sama siku Kanan Bawah");
        System.out.println("5. Segitiga sama siku Kanan Atas");

    }

    private static void actMenu(String act, int tinggi){
        switch (act){
            case "1":
                System.out.println("Menampilkan Segitiga Sama kaki");
                segitigaSamaKaki(tinggi);
                break;
            case "2":
                System.out.println("Segitiga sama siku Kiri bawah");
                break;
            case "3":
                System.out.println("Segitiga sama siku Kiri Atas");
                break;
            case "4":
                System.out.println("Segitiga sama siku Kanan Bawah");
                break;
            case "5":
                System.out.println("Segitiga sama siku Kanan Atas");
                break;
            default:
                System.err.println("pilihan anda tidak tersedia, Pilih 1-6");
        }
    }
    private static boolean getYesOrNo(String message){
        Scanner userInput = new Scanner(System.in);
        System.out.print("\n"+ message + "[y/n]");
        String pilihanUser;
        pilihanUser = userInput.next();

        while (!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")){
            System.err.println("Input yang anda masukan salah");
            System.out.print("\n"+ message + "[y/n]");
            pilihanUser = userInput.next();
        }
        switch (pilihanUser){
            case "n":
                System.out.println("============ END PROCESS ==========");

        }
        return pilihanUser.equalsIgnoreCase("y");
    }
    private static void segitigaSamaKaki (int tinggi){
        for (int t = 1 ; t <= tinggi ; t++){
            for (int s = tinggi - t ; s>0 ; s--){
                System.out.print(" ");
            }
            for (int b = 1 ; b <=t ; b++){
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
    private static int exception (int tinggi) {
        int hasil = 0;
        try {
            hasil = tinggi;
        } catch (Exception e) {
            System.err.println(e + "Data Array yang anda masukan salah");
        }
        return hasil;
    }


    }

