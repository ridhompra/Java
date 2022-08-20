package com.belajar;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class tryCatchFinally2 {
    public static void main(String[] args) {
        // kita akan melakukan test exception
        int [] dataArray = {0,1,2,3};

        Scanner userInput = new Scanner(System.in);
        System.out.print("Data Array ke- : ");
        int indexInput = userInput.nextInt();
        System.out.println("untuk menampikan Exception out of bound");
        try {
            System.out.printf("Data Array ke- %d adalah %d", indexInput, dataArray[indexInput]);
        }catch (Exception e){
            System.err.print(e+"\n===========\nData array yang anda masukan salah");
        }

        System.out.println("untuk menampikan IOException->file tidak ditemukan ");
        FileInputStream fileInput = null;
        try {
            fileInput = new FileInputStream("input.txt");
        }catch (IOException e){
            System.err.println(e+ "\n===============\nFile Tidak ditemukan");
        }

        // buat Exception didalam fungsi
        System.out.println("Menampikan Exception didalam fungsi");
        int data = eDidalamFungsi(dataArray,indexInput);
        System.out.printf("Data Array ke- %d adalah%d", indexInput, data);




        System.out.println("\n \n--- End Process ---");
    }
    private static int eDidalamFungsi(int[] array, int index){
        int hasil = 0;
        try {
            hasil = array[index];
        }catch (Exception e){
            System.err.println(e+"Data Array yang anda masukan salah");
        }
        return hasil;
    }

}
