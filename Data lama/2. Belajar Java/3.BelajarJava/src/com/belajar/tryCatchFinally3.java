package com.belajar;

import java.security.PrivateKey;
import java.util.Scanner;
import java.io.IOException;

public class tryCatchFinally3 {
    public static void main(String[] args) {
        int [] dataArray = {0,1,2,3};

        Scanner dataInput = new Scanner(System.in);
        System.out.print("Masukan data array ke- = ");
        int indexInput = dataInput.nextInt();

        //Exception biasa
        System.out.println("Menampilkan Exception biasa");
        try {
            System.out.printf("Data array ke-%d adalah %d",indexInput, dataArray[indexInput]);
        }catch (Exception e){
            System.err.println(e + "\nData Array yang anda masukan salah");
        }

        //Exception dengan fungsi
        System.out.println("Menampilkan Exception dengan fungsi");
        int data = ambilData(dataArray,indexInput);
        System.out.printf("Data array ke-%d adalah %d",indexInput, data);

        System.out.println("\n\n--- End Process ---");
    }
    private static int ambilData (int [] array, int index){
        int data = 0;
        try {
            data = array[index];
        }catch(Exception e){
            System.err.println(e+"\nData Array yang anda masukan salah");
        }
        return data;
    }
}
