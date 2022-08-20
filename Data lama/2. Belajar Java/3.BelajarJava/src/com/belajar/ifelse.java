package com.belajar;

public class ifelse {
    public static void main(String[] args) {
        int Nilai_siswa = 95;
        String Nama_Siswa = "Ridho mp Nilai = ";

        if (Nilai_siswa <= 75)  {
            System.out.println("C = Tidak Lulus " + Nama_Siswa + Nilai_siswa);
        } else if (Nilai_siswa<= 85) {
            System.out.println("B = Lulus " + Nama_Siswa + Nilai_siswa);
        } else if (Nilai_siswa<= 100) {
            System.out.println("A = Lulus " + Nama_Siswa + Nilai_siswa);
        } else {
            System.out.println("Nilai Error");
        }

    }
}
