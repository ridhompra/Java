package com.belajar;

public class Switch {
    public static void main(String[] args) {
        var nilai = "B";

        switch (nilai) {
            case "A":
                System.out.println("Anda lulus dengan nilai yang baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai anda Cukup");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Mungkin anda salah jurusan");
        }
        System.out.println("--- Switch Lambda harus java V 14---");
        /*var nilai2 = "A";
        switch (nilai2){
        case "A" -> System.out.println("anda lulus dengan nilai yg baik");
        case "B","C" -> System.out.println("nilai anda cukup");
        default -> System.out.println("mungkin anda salah jurusan");
        }

         */
        var nilaiUjian = 86;
        if (nilaiUjian < 75) {
            System.out.println("mohon maaf anda tidak lulus");
        } else if (nilaiUjian <= 85) {
            System.out.println("Selamat anda lulus dengan nilai B");
        } else if (nilaiUjian <= 100) {
            System.out.println("selamat anda lulus dengan nilai A");
        } else {
            System.out.println("Nilai Error");
        }
    }
}
