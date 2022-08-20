package com.crud;

import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        Scanner terminalInput = new Scanner(System.in);
        String pilihanUser ;
        Boolean melanjutkan = true;

        while (melanjutkan)
            cleaScrean();

        System.out.println("Data Perpustakaan \n");
        System.out.println("1.\tLihat seluruh buku");
        System.out.println("2.\tCari data buku");
        System.out.println("3.\tTambah data buku");
        System.out.println("4.\tUbah data buku");
        System.out.println("5.\tHapus data buku");

        System.out.print("\n\nPilihan Anda: " );
        pilihanUser = terminalInput.next();

        switch (pilihanUser) {
            case "1":
                System.out.println("LIST SELURUH BUKU");
                // tampilkan data
                break;
            case "2":
                System.out.println("CARI DATA BUKU");
                // Cari data
                break;
            case "3":
                System.out.println("TAMBAH DATABUKU");
                // Tambah data
                break;
            case "4":
                System.out.println("UBAH DATA BUKU");
                // Edit data
                break;
            case "5":
                System.out.println("HAPUS DATA BUKU");
                // Hapus data
                break;
            default:
                System.err.println("\n Input anda tidak ditemukan \n Silakan pilih nomor [1 - 5]");
        }
        melanjutkan = getYesOrNo("Apakah anda ingin melanjutkan?");
        }

    private static void tampilkanData() throws IOException{

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
    public static void cleaScrean (){
        try {
            if (System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }else {
                System.out.println("\033\143");
            }
        }
        catch(Exception ex){
            System.err.println("Tidak bisa Clear Screen");
        }
    }
}




















