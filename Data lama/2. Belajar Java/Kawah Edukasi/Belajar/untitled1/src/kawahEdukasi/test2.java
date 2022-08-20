package kawahEdukasi;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menampilkan Versi Looping");
        System.out.println("\t1. Versi For");
        System.out.println("\t2. Versi Wile");
        System.out.println("pilih versi looping= ");
        String pilihanUser= input.next();
        switch(pilihanUser){
            case "1":
                System.out.println("=== Menampilkan Versi For ===");
                versiFor();
                break;
            case "2":
                System.out.println("=== Menampilkan Versi For ===");
                versiWhile();
                break;
            default:
                System.out.println("Pilihan anda salah");
        }
    }
        public static void versiFor(){
            int  nilaiAwal, nilaiAkhit,total;
            Scanner input = new Scanner(System.in);

        System.out.print("Masukan nilai awal = ");
        nilaiAwal = input.nextInt();
        System.out.print("Masukan nilai akhir = ");
        nilaiAkhit = input.nextInt();

        total = 0;
        for(int i = nilaiAwal ; i<=nilaiAkhit;i++){
            total = total+i;
            System.out.println("ditambah = "+ i + " menjadi "+total);
        }

    }
    public static void versiWhile(){
        int  nilaiAwal, nilaiAkhit,total;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nilai awal = ");
        nilaiAwal = input.nextInt();
        System.out.print("Masukan nilai akhir = ");
        nilaiAkhit = input.nextInt();

        total = 0;
        while (nilaiAwal<=nilaiAkhit){
            total = total+nilaiAwal;
            System.out.println("ditambah = "+nilaiAwal+" Menjadi "+ total);
            nilaiAwal++;
        }
    }
}
