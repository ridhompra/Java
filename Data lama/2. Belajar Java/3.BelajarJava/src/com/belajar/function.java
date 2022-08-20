package com.belajar;

public class function {
    static void ucapSalam(){
        System.out.println("Selamat Pagi");
    }
    static void ucapin(String ucapan){
        System.out.println(ucapan);
    }
    static int luasPersegi (int sisi){
        int luas = sisi * sisi ;
        return luas ;
    }
    static int luasKubus (int sisi){
        int luasK = 6 * sisi;
                return luasK ;
    }
    public static void main(String[] args) {
        ucapSalam();
        ucapin ("Selamat Datang");
        System.out.println("luas dari persegi adalah " + luasPersegi (10)) ;
        System.out.println("Luas dari Kubus adalah "+ luasKubus(10));
    }
}
