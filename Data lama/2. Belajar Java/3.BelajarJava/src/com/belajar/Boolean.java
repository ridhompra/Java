package com.belajar;

public class Boolean {
    public static void main(String[] args) {
        var nilai = 75;
        var absen = 80;
        var lulusNilai = nilai >= 75;
        var lulusAbsen = absen >= 75;
        var lulus = lulusNilai && lulusAbsen;
        System.out.println(lulus);
    }
}
