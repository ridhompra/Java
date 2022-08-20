package JavaOOP;

import java.lang.reflect.Parameter;

public class Person {
    String name;
    String address;
    final String country = "Indonesia";
    String born;
    Person (String paramName ,String paramAddress){
        name = paramName;
        address = paramAddress;
    }
    Person (String name, String address,String born){
        // di kontruktor ini terjadi shadowing (variable field dan Parameter sama, u/ membedakannya bisa menggunakan keyword this u/ field)
        this.name = name;
        this.address = address;
        this.born = born;
    }
    // Contructor Overloading, nama Constructor boleh sama asal beda tipe data
    Person(){ //opsional boleh ditambah parameter atau tidak

    }
    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", my name is "+name);
    }

}
