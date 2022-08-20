package com.buatSegitiga;

import java.util.Scanner;

public class buatSegitiga {
    public static void main(String[] args) {
        boolean continu = true;
        while (continu) {
            Scanner input = new Scanner(System.in);
            mainMenu("=======================\n"+"Menampilkan Segitiga =");
            System.out.print("Pilih 2 dimensi (Masukan Nomor) = ");
            String inputMenu = input.next();
            System.out.print("Masukan sisi/tinggi = ");
            int inputSisi = input.nextInt();
            actMenu(inputMenu,inputSisi);
            continu = getYesOrNo("Apakah anda ingin melanjutkan");
        }
    }
    public static void mainMenu(String nomorMenu){
        System.out.println(nomorMenu);
        System.out.println("\t1. Segitiga sama Kaki");
        System.out.println("\t2. Segitiga Siku siku kiri");
        System.out.println("\t3. Segitiga sama kaki terbalik");
        System.out.println("\t4. Segitiga Sama Kaki Gabungan v1");
        System.out.println("\t5. Segitiga sama kaki Gabungan v2");
        System.out.println("\t6. Trapesium");
        System.out.println("\t7. Jajar genjang");
        System.out.println("\t8. Persegi bolong tengah");

    }
    public static void actMenu(String pilihanUser, int inputTinggi){

        switch (pilihanUser){
            case "1":
                System.out.println("==============================");
                System.out.println("Menampilkan Segitiga sama kaki");
                segitigaSamaKaki(inputTinggi);
                luasKelilingSegitiga(inputTinggi);
                break;
            case "2":
                System.out.println("==============================");
                System.out.println("Menampilkan Segitiga Siku Kiri");
                segitigaSikuKiri(inputTinggi);
                break;
            case "3":
                System.out.println("======================================");
                System.out.println("Menampikan Segitiga sama kaki terbalik");
                segitigaSamaKakiTerbalik(inputTinggi);
                break;
            case "4":
                System.out.println("======================================");
                System.out.println("Menampikan Segitiga sama kaki Gabungan");
                segitigaSamaKakiGabungan(inputTinggi);
                break;
            case "5":
                System.out.println("======================================");
                System.out.println("Menampilkan Segitiga Sama Kaki Gabungan 2");
                segitigaSamaKakiGabungan2(inputTinggi);
                break;
            case "6":
                System.out.println("======================================");
                System.out.println("Menampilkan Trapesium");
                trapesium(inputTinggi);
                break;

            case "7":
                System.out.println("======================================");
                System.out.println("Menampilkan Jajar genjang");
                jajarGenjang(inputTinggi);
                break;
            case "8":
                System.out.println("======================================");
                System.out.println("Menampilkan Persegi Bolong Tengah");
                persegiBolongTengah(inputTinggi);
                break;
            default:
                System.out.println("================================================");
                System.out.println("=== Input yang anda masukan salah[pilih 1-3] ===");
        }
    }
    public static void segitigaSamaKaki (int sisi){
        for (int i = 1 ; i <=sisi ; i++){
            for (int s = sisi - i ; s > 0  ; s --){
                System.out.print(" ");
            }
            for (int j = 1 ; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public static void segitigaSikuKiri(int sisi){
        for(int i = 1 ; i <= sisi ; i++){
            for (int b = 1 ; b <=i;b++){
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
    public static void segitigaSamaKakiTerbalik (int sisi){
        for (int i = 1; i<= sisi ; i++){
            for (int s = 1 ; s <i ; s++ ){
                System.out.print(" ");
            }
            for (int b = sisi ; b >=i ; b--){
                System.out.print(" *");
            }
                System.out.println("");
        }
    }
    public static Boolean getYesOrNo (String input){
        Scanner userInput = new Scanner(System.in);
        System.out.print("\n"+input + "[y/n]");
        String pilihanUser = userInput.next();

        while (!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")){
            System.out.println("=== input yang anda masukan salah ===");
            System.out.print(input + "[y/n]");
            pilihanUser = userInput.next();
        }
        switch (pilihanUser){
            case "N":
                System.out.println("=========== END PROCESS ==========");
        }
        return pilihanUser.equalsIgnoreCase("y");
    }
    public static void luasKelilingSegitiga (int sisi){
        int luas =(sisi * sisi) /2;
        System.out.println("luas dari segitiga adalah "+luas);
        int keliling = sisi * 3;
        System.out.println("Keliling dari segitiga adalah "+keliling);
    }
    public static void segitigaSamaKakiGabungan(int sisi){
        int sisi2 = sisi/2;
        for (int i = 1 ; i <= sisi2 ; i++ ){
            for (int s = 1 ; s < i; s++){
                System.out.print(" ");
            }
            for (int b = sisi2; b>=i ;b--){
                System.out.print(" *");
            }
            System.out.println("");
        }
        for (int i=1;i<=sisi2;i++){
            for (int s=sisi2-i ; s>0; s--){
                System.out.print(" ");
            }
            for (int b=1;b<=i;b++){
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
    public static void trapesium(int sisi){
        Scanner input=new Scanner(System.in);
        System.out.print("Masukan Alas atas = ");
        int alasA = input.nextInt();
        double alasB = alasA * 1.5;
        double luasTrapesium = ((alasA*alasB)/2)*sisi;
        System.out.println("luas Trapesiuum adalah "+luasTrapesium);
        double alasCb = (alasB-alasA)/2;
        double alasC= Math.sqrt(Math.pow(alasCb,2) + Math.pow(sisi,2));
        double kelilingTrapesium = alasA+alasB+(alasC*2);
        System.out.println("keliling Trapesium adalah "+kelilingTrapesium);

        for(int t=1 ;t<=sisi; t++){
            for (int s=sisi-t;s>0;s--){
                System.out.print(" ");
            }
            for (int b=1;b<alasA+t;b++){
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
    public static void jajarGenjang(int sisi){
        for (int t=1 ; t<=sisi ; t++){
            for (int s=sisi-t ; s>0 ; s--){
                System.out.print(" ");
            }for (int b=1 ; b<=sisi*1.5 ;b++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
    public static void segitigaSamaKakiGabungan2(int sisi){
        int sisi2 = sisi/2;
        for (int i = 1; i<=sisi2 ; i++){
            for (int s = sisi2-i ; s >0; s--){
                System.out.print(" ");
            }
            for (int b = 1; b<=i;b++){
                System.out.print(" *");
            }
            System.out.println("");
        }
        for (int i = 1 ; i<=sisi2;i++){
            for (int s = 0; s<i;s++){
                System.out.print(" ");
            }
            for (int b= sisi2-1 ; b>=i ; b--){
                System.out.print(" *");
            }

            System.out.println("");
        }
    }
    public static void persegiBolongTengah(int sisi){
        for (int i = 1; i <= sisi; i++) {
            for (int b = 1; b <= sisi; b++) {
                if (i == 1) {
                    System.out.print(" *");
                } else if (i == sisi) {
                    System.out.print(" *");
                } else if (b == 1) {
                    System.out.print(" *");
                } else if (b == sisi) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}


