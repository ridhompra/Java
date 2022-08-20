package com.belajar;

import java.io.IOException;
import java.util.Scanner;

public class trayCatchFinally {
    public static void main(String[] args) {
    int [] arrayData = {0,1,2,3};
    Scanner dataInput = new Scanner(System.in);
        System.out.print("Masukan data array ke- = ");
        int indexInput = dataInput.nextInt();

        // exception biasa
        System.out.println("--- Exception biasa ---");
        try{
            System.out.printf("Data array ke- %d adalah %d", indexInput, arrayData[indexInput]);
        }catch(Exception e) {
            System.err.println(e);
        }

        // exception didalam fungsi
        System.out.println("\n\n--- Exception didalam Fungsi ---");
        int data = ambilDataArray(arrayData,indexInput);
        System.out.printf("Data array ke- %d adalah %d", indexInput, data);

        // exception didalam method
        System.out.println("\n\n--- Exception didalam Method ---");



        System.out.println("\n\n ---Process Ended--- ");
    }
    private static int ambilDataArray(int[] array, int index){
        int hasil =0;
        try{
            hasil = array [index];
        }catch(Exception e){
            System.err.println(e);
        }
        return hasil;
    }

}
