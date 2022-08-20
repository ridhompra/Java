package OOP.oop;

public class heroStenght extends hero{
    String type = "Strenght";

    heroStenght(String nama) {
        super(nama);
    }
    public void display(){
        super.display();
        System.out.println("type\t: "+ type);
    }
}
