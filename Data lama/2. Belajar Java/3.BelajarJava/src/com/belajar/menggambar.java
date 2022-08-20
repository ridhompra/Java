package com.belajar;

import java.security.PrivateKey;
import java.util.Scanner;

public class menggambar {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Panjang = ");
        int userPanjang = user.nextInt();
        System.out.print("Lebar  = ");
        int userLebar = user.nextInt();
        gambar(userPanjang,userLebar);
        System.out.println("Luas Persegi = " + luasPersegi(userPanjang,userLebar));
        System.out.println("Keliling Persegi = " + kelilingPersegi(userPanjang,userLebar));

        System.out.print("Tinggi = ");
        int usertinggi = user.nextInt();
        System.out.println("Volume Kubus = " + volumeKubus(userPanjang,userLebar,usertinggi));

    }
    private static void gambar( int panjang , int lebar){
        for (int i  = 0 ; i < lebar ; i++){
            for (int j = 0 ; j < panjang; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    private static int luasPersegi (int panjang, int lebar){
        int hasilLuasPersegi = panjang * lebar;
        return hasilLuasPersegi;
    }
    private static int kelilingPersegi (int panjang, int lebar){
        int hasilKelilingPersegi = (panjang + lebar ) *2;
        return hasilKelilingPersegi;
    }
    private static int volumeKubus (int panjang, int lebar, int tinggi){
        int hasilVolumeKubus = panjang * lebar * tinggi;
        return hasilVolumeKubus;
    }

}
