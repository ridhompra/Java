package kawahEdukasi;

import java.util.Locale;
import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        boolean pilihanUser = true;
        while(pilihanUser) {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukan Kata 1 = ");
            String kata1 = input.nextLine();
            System.out.print("Masukan Kata 2 = ");
            String kata2 = input.nextLine();
            String hasil = kata1 + kata2;
            String loop = "";
            try {
                for (int i = hasil.length() - 1; i >= 0; i--) {
                    loop = loop + hasil.charAt(i);
                }
                if (hasil.equals(loop)) {
                    System.out.println(hasil + "adalah Palindrome");
                } else {
                    System.out.println(hasil + "bukan Palindrome");
                }
            } catch (Exception e) {
                System.out.println("data yang anda masukan salah, silakan coba lagi");
            }
            pilihanUser = getYesOrNo();
        }
    }
    private static boolean getYesOrNo () {
        Scanner input = new Scanner(System.in);
        System.out.println("ingin melanjutkan (y/n) ? ");
        String pilihan = input.next();
        while (!pilihan.equalsIgnoreCase("y") && !pilihan.equalsIgnoreCase("n")) {
            System.out.println("====== pilihan anda bukan (y/n) ====== ");
        }
        return pilihan.equalsIgnoreCase("y");
    }
}



















