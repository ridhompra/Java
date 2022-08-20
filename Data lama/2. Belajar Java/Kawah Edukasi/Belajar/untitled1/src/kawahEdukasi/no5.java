package kawahEdukasi;
//5. Buatlah program untuk mengurutkan deretan angka dari terkecil sampaiterbesar! Contoh:
//        - Input = [1, 6, 7, 4, 2, 9, 5]
//        Ouput = [1, 2, 4, 5, 6, 7, 9]


import java.util.Arrays;
import java.util.Scanner;

public class no5 {

    public static void main(String[] args) {

        int[] dataArray = {1, 6, 7, 4, 2, 9, 5};


        System.out.println(Arrays.toString(urutkanArray(dataArray)));
    }

    public static int[] urutkanArray(int[] dataArray) {
            int sementara;
            for (int i = 0; i < dataArray.length; i++) {
                for (int j = (i + 1); j < dataArray.length; j++) {
                    boolean urutkan =  dataArray[i] > dataArray[j] ;
                    if (urutkan) {
                        sementara = dataArray[i];
                        dataArray[i] = dataArray[j];
                        dataArray[j] = sementara;
                    }
                }
            }


        return dataArray;
    }
}