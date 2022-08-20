package kawahEdukasi;

import java.util.Arrays;
import java.util.Scanner;

public class belajarMengurutkanArray {
    public static void main(String[] args) {
    int [] dataArray = {5,6,4,3,7,4,9,10};
        System.out.println(Arrays.toString(mengurutkanArray(dataArray)));
    }
    public static int[] mengurutkanArray(int[]dataArray){
        int sementara ;
        for (int a = 0 ; a < dataArray.length ; a++){
            for (int b = a+1; b < dataArray.length;b++){
                boolean urutkan = dataArray[a]>dataArray[b];
                if (urutkan){
                    sementara = dataArray[a];
                    dataArray[a] = dataArray[b];
                    dataArray[b] = sementara;

                }
            }
        }
    return dataArray;
    }
}
