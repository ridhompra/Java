package JavaOOP;

public class managerAPP {
    public static void main(String[] args) {
        var manager = new manager("Ridho");
        manager.sayHello("Razqa","Investree");

        var vp = new vicePresident("Ridho");
        // overriding method, jika class manager, myname is manager,
        // diclass vicePresident menggunakan myname is VP
        // di child class menggunakna Overrriding method dimana, method dari parent di edit isinya di child class
        vp.sayHello("Razqa","Investree");
    }
}
