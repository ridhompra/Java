package com.belajar;

public class if_statement {
    public static void main(String[] args) {
        var nilai = 70;
        var absen = 80;
        if (nilai >=75 && absen >= 75) {
            System.out.println("anda lulus");
        }
        else {
            System.out.println("anda tidak lulus");
        }
        // penulisan bisa juga
        var nilai1 = 70;
        var absen1 = 80;
        var lulus1 = nilai1 >75 && absen1 >75;
        if (lulus1){
            System.out.println("lulus");
        }
        else {
            System.out.println("tidak lulus");
        }
        // if else statement
        System.out.println("-----------------ifelse------------------");
        var nilai2 = 100;
        var absen2 = 86;
        var total = 2;
        var nilaiTotal = (nilai2 + absen2) / total;
        if (nilaiTotal <75){
            System.out.println("Anda tidak lulus, silakan coba dilain kesempatan");
        }
        else if (nilaiTotal <=85 ){
            System.out.println("Anda lulus dengan nilai B");
        }
        else if (nilaiTotal <=100 ){
            System.out.println("Anda lulus dengan nilai A");
        }
        else {
            System.out.println("nilai error");
        }

    }
}
