package kawahEdukasi;
import com.sun.jdi.ArrayReference;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.nio.channels.SeekableByteChannel;
import java.util.Arrays;
import java.util.Scanner;

public class test3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements you  want to store = ");
        int jumlahArray = input.nextInt();
        memasukanArray(jumlahArray);
    }
    public static void memasukanArray(int jumlahArray) {
        Scanner input = new Scanner(System.in);
        int array[] = new int[jumlahArray];
        System.out.println("Enter Elements Array : ");
        for (int i = 0; i < jumlahArray; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("Array elements are : ");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Menampilkan Seaching Array");

    }
}