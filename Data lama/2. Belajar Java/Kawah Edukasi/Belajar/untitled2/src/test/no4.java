package test;

import java.util.Scanner;

public class no4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nama Kota = ");
        String inputKota = input.next();
        kota(inputKota);
    }
    private static void kota(String istilahKota){
        switch (istilahKota){
            case "Bandung":
                System.out.println("Gemah Ripah Wibawa Mukti");
                break;
            case "Tangerang":
                System.out.println("Bhakti Karya Abdhi Kertaraharja");
                break;
            case "Solo":
                System.out.println("The Spirit of Java ");
                break;
            case "Padang":
                System.out.println("Padang Kota Tercinta");
                break;
            default:
                System.out.println("Mohon maaf untuk kota lain belum ditambahkan");
        }
    }
}