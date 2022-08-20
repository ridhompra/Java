package com.buatSegitiga;

public class test {
    public static void main(String[] args) {
        int tinggi = 10;
        for (int i = 1; i <= tinggi; i++) {
            for (int b = 1; b <= tinggi; b++) {
//                System.out.print(" *");
                if (i == 1) {
                    System.out.print(" *");
                } else if (i == tinggi) {
                    System.out.print(" *");
                } else if (b == 1) {
                    System.out.print(" *");
                } else if (b == tinggi) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
                System.out.println("");
        }
    }
}



