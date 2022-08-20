package com.belajar;

public class stringFormat {
    public static void main(String[] args) {
        String nama = "ridho";
        int umur = 21;

        System.out.println("Nama saya "+ nama + ", umur saya "+ umur);

        // ada cara lain, menggunakan printf
        System.out.printf("nama saya %s , Umur saya %d tahun",nama, umur); // lebih mudah dibaca kann

        // conversi %s = String, %d = Integer , %f = Floating Point, %b = Boolean
        // struktur Format = %[argument index $] [flags] [widht] [.precision] convertion

        //[argument index $]
        System.out.println("\n \n [argument index $]");
            // misal kita mau buat :  ridho, wahai ridho, kemana saja kamu ridho
        System.out.printf("%1$s, wahai %1$s , Kemana saja kamu wahai %1$s ? ", nama);
                            // argument yang pertama, jadi tidak perlu memanggil nama nama nama
        // misal kita mau buat lagi : umur ridho berapa, ridho menjawab : 21 , wah masih muda yah 21
        System.out.printf("\n umur %1$s berapa?, %1$s menjawab : %2$d, wah masih muda ya %2$d ",nama,umur);
    }
}
