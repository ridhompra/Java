package JavaOOP;

public class vicePresident extends manager {
    vicePresident(String name){
        super(name);
    }
    // Class Child dari class manager (extends)
    // overiding Method, mendeklarasi ulang method di childclass dari parent class
    // saat melakukan oeverridng nama method dan parameter harus sama yg boleh beda isi dari
    // methodnya itu
    void sayHello(String name,String company){
    System.out.println("Hello" + name + ", my name is VP "+ this.name+ " manager di perusahaan "+ company);
}
}
