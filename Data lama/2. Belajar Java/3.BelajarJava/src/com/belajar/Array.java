package com.belajar;

import java.sql.SQLOutput;

public class Array {
    public static void main(String[] args) {
        // Array 2 D
        //String
        String[] namaMahasiswa = {"Ridho", "maulana", "Prastian"};
        System.out.println("Nama Mahasiswa = " + namaMahasiswa[0]);
        System.out.println("Nama Mahasiswa = " + namaMahasiswa[1]);
        System.out.println("Nama Mahasiswa = " + namaMahasiswa[2]);

        String [] namaKaryawan;
        namaKaryawan = new String[3];
        namaKaryawan[0] = "Ridho ";
        namaKaryawan[1] = "Maulana ";
        namaKaryawan[2] = "Prastian ";
        System.out.println("Nama Karyawan = " + namaKaryawan[0] + namaKaryawan[2]);

        //Int
        Integer[] nilaiMahasiswa = {100, 80, 75};
        System.out.println(nilaiMahasiswa[1]);
        // test ngubah nilai
        int [] dataInteger = { 10, 20, 30, 40, 50};
        System.out.println("Data sebelum di ubah = " + dataInteger[0]);
        dataInteger[0] = 100 ;
        System.out.println("Data setelah diubah = " + dataInteger[0]);
        System.out.println(dataInteger.length); // untuk liat panjang array menggunakan .lenght
        //----------------------------------------------------------
        //Array dalam Array
        String [][] members = {
                {"Ridho ", "Maulana ", "Prastian "} ,
                {"Reza ","Abdillah ","Prastian" },
                {"Razqa ", "Arrafi", "Prastian"},
        };
        String[] member1 = members[0];
        System.out.println(member1[0]);
        System.out.println(members[1][0]);
        System.out.println(members[1][1]);
        System.out.println(members [2][1]);
    }
}