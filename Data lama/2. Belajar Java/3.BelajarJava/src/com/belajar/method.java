package com.belajar;

import com.sun.jdi.Value;

public class method {
    public static void main(String[] args) {
        sayHelloWorld();
        methodParameter("Ridho", "Maulana P");
        methodParameter("Reza", "Abdillah P");
        methodParameter("Siti", "Yatiyana");
        System.out.println(sum(100,100));
        System.out.println(menghitung(100,"+",300));
        System.out.println(menghitung (400,"-", 100));
        System.out.println(menghitung(300, "salah", 300));
        sayCongrats("Ridho" , 90 , 90, 90,90);
        sayhello();
        sayhello("Ridhomp");
        sayhello("Ridho ", "Maulana Prastian");
        sayhello("Ridho ", "Maulana Prastian", 21);
        System.out.println(factorialLoops(5));
        System.out.println(1*2*3*4*5);
        System.out.println(factorialRecursive(5));
        loop(10);





    }
    static void sayHelloWorld (){
        System.out.println("HelloWorld 1");
        System.out.println("HelloWorld 2");
        System.out.println("HelloWorld 3");
    }
    static void methodParameter (String firstname, String lastname){
        System.out.println("Hello "+firstname +" "+ lastname);
    }

    static int sum(int value1 , int value2){
        var total = value1 + value2;
        return total;
    }
    static int menghitung (int value1 , String operasi, int value2){
        switch (operasi){
            case "+":
                return  value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return 0 ;
        }
    }
    static void sayCongrats (String names, int... value) {
        // dengan Variable argument, jadi tidak perlu buat array nya julu
        var total = 0;
        for (int values : value) {
            total += values;
        }
        var finaltotal = total / value.length;
        if (finaltotal >= 75) {
            System.out.println("selamat " + names + ", Anda lulus");
        } else {
            System.out.println("Maaf " + names + ", Anda tidak lulus");
        }
    }
    // overloading method,
        // secara default dengan nama method yang sama itu tidak bisa
        // tapi method Overloading bisa dengan syarat data parameter pada method berbeda
        // Jika ada yang sama maka akan error, berikut contohnya

    static void sayhello(){
        System.out.println("hello");
    }
    static void sayhello(String firstName){
        System.out.println("Hello "+ firstName);
    }
    static void sayhello (String firstName , String lastName){
        System.out.println("Hello " + firstName + lastName);
    }
    static void sayhello ( String firstName , String lastName, int umur ){
        System.out.println("Hello " + firstName + lastName + umur + " tahun");
    }
    static int factorialLoops ( int value){
        var nilai = 1;
        for (var counter = 1 ; counter <= value ; counter++){
            nilai *= counter;
        }return nilai;
    }
    static int factorialRecursive (int value){
        if (value == 1){
        return 1;
        }else {
            return value * factorialRecursive( value -1);
        }
    }
    static void loop (int value){
        if (value == 0){
            System.out.println("selesai");
        }else{
            System.out.println("Loop" + value);
            loop(value -1);
        }
    }
}
