package com.belajar;

import com.sun.jdi.Value;

public class testAja {
    public static void main(String[] args) {
        System.out.println("----------If Else----------");
        var nilaiMahasiswa = 90;
        var nilaiabs = 85;
        var nilaiKKM = (nilaiMahasiswa+nilaiabs)/2;
        System.out.println(nilaiKKM);
        if (nilaiKKM <75){
            System.out.println("maaf anda tidak lulus");
        }else if (nilaiKKM <=85){
            System.out.println("Selamat anda lulus dengan nilai yang cukup");
        }else if (nilaiKKM <=100){
            System.out.println("Selamat anda lulus dengan nilai memuaskan");
        }else{
            System.out.println("nilai anda error");
        }
        System.out.println("----------Switch case----------");
        var numberDays = 1;
        switch (numberDays){
            case 1 :
                System.out.println("Sunday"); break;
            case 2 :
                System.out.println("Monday"); break;
            case 3 :
                System.out.println("Thursday");break;
            case 4 :
                System.out.println("Wednesday");break;
            case 5 :
                System.out.println("Tuesday");break;
            case 6 :
                System.out.println("Friday");break;
            case 7 :
                System.out.println("Satudya");break;
            default :
                System.out.println("salah hari");break;
        }

        System.out.println("----------Test pakai Boolean----------");
        var nilaiUjian = 10;
        var nilaiKehadiran = 10;
        var kkmUjian = nilaiUjian >= 75;
        var kkmKehadiran = nilaiKehadiran >= 75;
        var lulus = kkmKehadiran && kkmUjian;
        System.out.println(lulus);
        if (lulus){
            System.out.println("selamat kamu lulus");
        }else{
            System.out.println("mohon maaf anda tidak lulus");
        }



        System.out.println("----------Test Array---------");
        String [] testArray = {"Ridho", "Maulana", "Prastian"};
        System.out.println("Menampilkan Maulana = "+testArray[1]);
        String [][] testArray2 = {
                {"Ridho", "Maulana", "Prastian"},
                {"Reza", "Abdillah", "Prastian"},
                {"Razqa", "Arrafi", "Prastian"},
        };
        System.out.println("Menampilan Ridho Abdillah Prastian = ");
        System.out.print(testArray2[0][0]);
        System.out.print(testArray2[1][1]);
        System.out.print(testArray2[2][2]);

        System.out.println("---------- Ternary Operator----------");
        var nilaiTenary = 74;
        String hasilKelulusan = nilaiTenary>=75 ? "Selamat anda lulus ": "Maaf anda Tidak lulus";
        System.out.println(hasilKelulusan);
        System.out.println("---------- For -----------");
        for (var counterFor =1 ; counterFor<=3 ; counterFor++){
        System.out.println("Pengulangan ke- " +counterFor);}
        System.out.println("----- While -----");
        // While sama seperti for, hanya saja lebih singkat
        //perbedaannya do while itu eksekusi dulu baru cek jadi walau salah alngusng muncul
        var counterWhile = 1;
        while (counterWhile<=3){
            System.out.println("counterWhile ke- "+counterWhile);
            counterWhile++;
        }
        System.out.println("----- while do ------");
        var counterDo = 1;
        do {
            System.out.println("counterDo ke- " + counterDo);
            counterDo++;
        }while (counterDo <= 3) ;
        System.out.println("------ Break dan Continue------");
        // Break itu menyetop tuntas hasil perhitungan cek code berikut
        var counterBreak = 1;
        while(true){
            System.out.println("pengulangan Break ke- "+ counterBreak);
            counterBreak++;
            if (counterBreak>3){
                break;
            }
        } System.out.println("counte Break Ends");
        System.out.println("-----continue-----");
        // break sementara
        // contoh ketika mendapati nilai genap akan di break dan dilanjut counting ke angka selanjutnya
        for (var nilaiGanjil = 1 ; nilaiGanjil<=10;nilaiGanjil++){
        if (nilaiGanjil %2 == 0){
            continue;
        }
            System.out.println("nilaiGanjil ke- " + nilaiGanjil);
    }
        System.out.println("------- FOR EACH -----");
        // FOR EACH UNTUK MENGAMBIL DATA SECARA KESELURUHAN
        // CONTOH TANPA FOR EACH
        String [] arr = {
                "Ridho", "Maulana", "Prastian", "Reza","Abdillah"
        };
        for (int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
        // menggunakan for each
        for (String nama : arr ){
            System.out.print(nama);
        }

}
}


