package kawahEdukasi;

import java.lang.reflect.Array;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] array = {9, 6, 4, 6};
        int mem;
        System.out.println("show loop in array =");
        System.out.println(Arrays.toString(mengurutkan(array)));
    }

    public static int[] mengurutkan(int[] dataArray) {
        int mem ;
        for (int i = 0; i < dataArray.length; i++) {
            for (int j = i + 1; j < dataArray.length; j++) {
                boolean urutkan = dataArray[i] > dataArray[j];
                if (urutkan) {
                    mem = dataArray[i];
                    dataArray[i] = dataArray[j];
                    dataArray[j] = mem;
                }
            }
        }
    return dataArray;
    }
}
