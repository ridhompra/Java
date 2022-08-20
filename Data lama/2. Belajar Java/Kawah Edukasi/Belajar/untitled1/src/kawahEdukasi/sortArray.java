package kawahEdukasi;

import java.util.Arrays;

public class sortArray {
    public static void main(String[] args) {
        int[] dataArray = {1, 5, 7, 8, 4, 6, 3, 2, 2, 34, 65,};
        mengurutkanArray(dataArray);
        int posisi = Arrays.binarySearch(dataArray,65);
        System.out.println(posisi);
    }
    public static void mengurutkanArray (int[] dataArray){
        System.out.println("Menampilkan Sort pada Array\n==========================");
        System.out.println(Arrays.toString(dataArray));
        Arrays.sort(dataArray);
        System.out.println(Arrays.toString(dataArray));
    }
    }

