package com.belajar;

import java.sql.SQLOutput;
import java.util.jar.JarEntry;

public class loopDalamLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    break;
                }
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i + j) == 4) {
                    break;
                }
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    break;
                } else if ((i + j) == 9) {
                    break;
                }
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == j) {
                    break;
                } else if ((i + j) == 6) {
                    break;
                }
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}