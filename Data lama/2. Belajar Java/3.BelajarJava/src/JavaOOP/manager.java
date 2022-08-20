package JavaOOP;

public class manager{
    String name;
    String company;
    manager(String name){
        this.name = name;
    }
    manager(String name, String company){
        this.name = name;
        this.company = company;
    }

    void sayHello(String name,String company){
        System.out.println("Hello" + name + ", my name is Manager "+ this.name + " manager di perusahaan "+ company);
    }
}
