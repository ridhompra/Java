package kawahEdukasi;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class no4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nama Kota = ");
        String inputKota = input.nextLine();
        kota(inputKota);
    }
    private static void kota(String istilahKota){
        switch (istilahKota.toLowerCase()){
            case "kota bandung":
                System.out.println("Gemah Ripah Wibawa Mukti");
                break;
            case "kota tangerang":
                System.out.println("Bhakti Karya Abdhi Kertaraharja");
                break;
            case "kota solo":
                System.out.println("The Spirit of Java ");
                break;
            case "kota padang":
                System.out.println("Padang Kota Tercinta");
                break;
            default:
                System.out.println("Mohon maaf untuk kota lain belum ditambahkan");
        }
    }
    }

