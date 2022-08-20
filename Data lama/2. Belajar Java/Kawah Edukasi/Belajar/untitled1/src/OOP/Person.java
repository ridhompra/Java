package OOP;

public class Person {
        String name, address;
        final String country = "Indonesia";
        Person(String paramName, String paramAdress){
                name = paramName;
                address = paramAdress;
        }

        void param(String paramName){
                System.out.println("Halo "+paramName +" Nama saya "+ name );
        }
}
