package JavaOOP;

public class personAPP {
    public static void main(String[] args) {
        var person1 = new Person("Ridho", "Bekasi");
        person1.sayHello("Reza");

        Person person3 = new Person("Razqa", "Cilegon");
        person3.sayHello("Reza");

        Person person4 = new Person(); // paramname bisa kosong karena konstruktor di set boleh kosong
        person4.name = "Ridho";
        person4.address = "Cilegon"; // name di isi manual
        person4.sayHello("lala");

    }
}
