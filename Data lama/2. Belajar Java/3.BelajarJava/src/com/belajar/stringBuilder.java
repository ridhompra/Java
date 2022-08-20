package com.belajar;
// import
import java.lang.StringBuilder;

public class stringBuilder {
// mulai java  ke 5 mulai ada String builder daripada buat string sebelumnya
    // upaya saat membuat/ membangun String lebih mydah
    // ribet saat edit/delete ditengah2
    // memori lebih sedikit tidak menambah nambah sub string di sringpool
public static void main(String[] args) {
    // di String builder punya kapasitas (default 16)
    StringBuilder builder = new StringBuilder("Halo");
    System.out.println("data = "+ builder);
    System.out.println("capacity = " + builder.capacity());// jadi default kan 16 + 4 char jadi 20
    System.out.println("panjang = " + builder.length());

    // menampilkan address

    // beberapa operasi yang ada di builder
    // append -> concat/menggabungkan kata, kalau concat akan membuat memori baru
    builder.append(" Semuanya");
    printData(builder);

    builder.append(" Warga Cilegon banten");
    printData(builder);
    // Capacity menyesuaikan , walaupun lebih String builder tetap menggunakan Adress yang sama
    // jadi penggunaam memori lebih efisien

    // insert
    builder.insert(19," Kota");
    printData(builder); // menambahkan kata/kalimat pada ofset ke berapa

    // delete
    builder.delete(19,24);
    printData(builder);

    // rubahchar pada index tertentu
    builder.setCharAt(14,'W');
    printData(builder);

    // replace kata
    builder.replace(20,27,"Kota Serang");
    printData(builder);

    // Casting menjadi String
    String kalimat  = builder.toString();
    System.out.println(kalimat);
    int addressBuilder = System.identityHashCode(kalimat);
    System.out.println("Adress = "+ addressBuilder);
    // Jadi kalau mau nambahin pakai StringBuilder setelah selesai nambahin ubah lagi ke String
    // jadi memori tidak banyak terpakai (akibat banyak edit)
}


private static void printData (StringBuilder dataBuilder){
    System.out.println("data = "+ dataBuilder);
    System.out.println("capacity = " + dataBuilder.capacity());// jadi default kan 16 + 4 char jadi 20
    System.out.println("panjang = " + dataBuilder.length());
    int addressBuilder = System.identityHashCode(dataBuilder);
    System.out.println("address = " + Integer.toHexString(addressBuilder));
    System.out.println("==================================================");

}
}
















