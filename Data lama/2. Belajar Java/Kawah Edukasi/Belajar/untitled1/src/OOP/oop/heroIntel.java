package OOP.oop;

public class heroIntel extends hero {
    String type = "Intel";

    public heroIntel(String nama) {
        super(nama);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("type\t: "+type);
    }
}
