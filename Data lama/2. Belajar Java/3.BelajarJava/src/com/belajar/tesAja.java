package com.belajar;

public class tesAja {
    public static void main(String[] args) {
        String s = "Java"+1+2+"Quiz"+""+(3+4);
        System.out.println(s);
        System.out.println("=========================");

        String s1 = "abc";
        StringBuffer s2 = new StringBuffer(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s2)); // false karena s1 masuk ke String Pool Memory dan S2 masuk ke Heap memory
        // untuk membandingkan string buffer tidak bisa menggunakan ==
        System.out.println("=========================");

        String s3 = new String("abc");
        System.out.println(s1 == s3); // false karena S1 masuk ke memori String Pool
        System.out.println(s1==s3.intern());
        // True karena  ketika s3.intern dipanggil maka akan cek string "abc"
        // ke pool Memory

    }
}
