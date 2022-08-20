import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.swing.DefaultBoundedRangeModel;

class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("AI : insert your name");
        System.out.print("ME : ");
        String name = sc.nextLine();
        System.out.println("AI : insert your age");
        System.out.print("ME : ");
        String age = sc.nextLine();
        System.out.println("AI : Where are you come from");
        System.out.print("ME : ");
        String from = sc.nextLine();
        System.out.println("AI : so what`s your hobby");
        System.out.print("ME : ");
        String hobby = sc.nextLine();
        System.out.println("\n\n\n\nHello "+name);
        System.out.println("its a great day to start your "+ hobby);
        System.out.println("\n\n Show "+name + " Profile");
        boolean loop = true;
        while (loop){
        System.out.print("Y/N ===>");
        String choice = sc.nextLine();
        switch (choice){
            case "y":
            System.out.println("\n\n\n=== "+ name + " Profile ===");
            System.out.println("\n\n\nName\t= "+ name);
            System.out.println("Age\t= "+ age);
            System.out.println("Address\t= "+ from);
            loop = false;
            break;
            case "n":
            System.out.println("\n\n=== END PROCESS ===");
            loop = false;
            break;
            default:
            System.out.println("Wrong input !!!");break;
        }
    }
    }

}
