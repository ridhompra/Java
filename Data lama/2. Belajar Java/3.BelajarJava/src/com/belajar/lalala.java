package com.belajar;


import java.util.Scanner;

public class lalala {
    public static void main(String[] args) {
        // firstly build a variable
        String nama, alamat;
        Integer usia, gaji;
        //explore more about libraries :(((
        Scanner Keyboard = new Scanner(System.in);
        // Input
        System.out.print("Nama = ");
        // If Variable String use "nextLine"
        nama = Keyboard.nextLine();
        System.out.print("Alamat = ");
        alamat = Keyboard.nextLine();
        System.out.print("Usia = ");
        // if Variable Integer use "Next int"
        usia = Keyboard.nextInt();
        System.out.print("Gaji  = ");
        gaji = Keyboard.nextInt();
        //output
        System.out.println("----------------------");
        System.out.println("Nama = " + nama);
        System.out.println("Usia = " + usia + " Tahun");
        System.out.println("Alamat = " + alamat);
        System.out.println("Gaji = Rp. " + gaji);
    }
}