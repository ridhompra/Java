package com.belajar;
import java.lang.String;
import java.util.Locale;
import java.util.Scanner;

public class string{
    public static void main(String[] args) {
        // String literal
        String kalimat = "Saya suka makan mie ayam";

        // mengambil char pada string
        System.out.println(kalimat.charAt(0));

        // mengambil kalimat string
        String kata = kalimat.substring(10,15);
        System.out.println(kata);

        // concatenation (concat), menggabungkan kata
        String kalimat2 = kata + " Pecel ayam";
        System.out.println(kalimat2);

        // menimpa kata
        kata = kata + " cireng";
        System.out.println(kata);

        // concat dengan beda tipe data
        int jumlah = 30;
        System.out.println(kata + " " + jumlah);

        // uppercase dan lower case
        System.out.println(kalimat.toUpperCase());// Kalimat akan menjadi kapital semua
        System.out.println(kalimat.toLowerCase());// Kalimat akan menjadi kecil semua

        // replace
        String kalimat4 = kalimat.replace("mie ayam","sayur kangkung");
        System.out.println(kalimat4);

        //compare -> berdasarkan alphabet
        String motor1 = "Motor Lexam";
        String motor2 = "Motor Soul"; //lmnopqrs
        System.out.println(motor1.compareTo(motor2));
        System.out.println(motor2.compareTo(motor1));






    }
}
