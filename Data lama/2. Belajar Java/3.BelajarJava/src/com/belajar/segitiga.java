package com.belajar;

import java.util.Scanner;

public class segitiga {
    public static void main(String[] args) {
        int tinggi ;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Tinggi = ");
        tinggi = input.nextInt();
        int jum=1; // untuk menghilangkan bilangan genap
        input.close();
        // buat tinggi
        for (int i = 1 ; i<=tinggi; i++ ){
            // buat spasi
            for (int s = tinggi - i ; s > 0; s--){
                System.out.print(" ");
                //ketika tinggi yang dimasukan 3 dan i bernilai 1 = berarti akan memberi spasi 2kali
                // di bariske 2 tinggi dimasukan 3 dan i bernilai 2 = berarti akan memberi spasi 1 kali
                // di bariske 3 tinggi dimasukan 3 dan i bernilai 3 = berarti akan memberi spasi 0 kali
                // ketika sudah mencapai 0 maka akan stop
            }
            //untuk baris
            for (int b = 1 ; b<=jum ; b++){
                System.out.print("*");
                // jadi jum itu ketika bariske 1 itu nilai nya 1
                // ketika baris ke 2 nilai 1 ditambah kan jum (jum+=2) jadi tambah 2 jadi print * 3 kali
                // ketika baris ke 3 nilai 3 ditambahkan lagi (jum+=2) jadi tambah 2 jadi print * 5 kali
            }
            jum+=2;// jum = jum + 2
            System.out.println("");
        }
    }
}
