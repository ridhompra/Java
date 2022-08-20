package com.belajar;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Matematik {
    public static void main(String[] args) {
        int a = 100 ;
        int b = 10 ;
        System.out.println(a+b); // penjumlahan
        System.out.println(a-b); // Pengurangan
        System.out.println(a/b); // Pembagian
        System.out.println(a*b); // Perkalian
        System.out.println(a%b); // Sisa Pembagi
        //Augemented Assignment
        int c  = 100;
        c += 10 ;
        System.out.println(c);

        int d = 900;
        int e = 10;
        d++ ;
        System.out.println(d);
        e-- ;
        System.out.println(e);
        System.out.println(!true);
        // Perbandingan
        int value1 = 100;
        int value2 = 100;
        System.out.println(value1 > value2); // Hasil akan False
        System.out.println(value1 == value2); //Hasil akan True
    }





}
