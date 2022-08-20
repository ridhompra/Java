package OOP;

import org.w3c.dom.CDATASection;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.sql.ClientInfoStatus;
import java.util.Scanner;


public class birthday {
    public static void main(String[] args) throws AWTException,InterruptedException {
        int x = 1000;

        Robot robot = new Robot ();
        Scanner sc = new Scanner(System.in);

        System.out.println("input your Birthday greetings : ");
        String lulu = sc.nextLine();

        System.out.println("====== THE SPAMMING WILL BE START IN 5s =====");
        Thread.sleep(5000);
//            while (x >= 18) {
//                System.out.println("====== THE SPAMMING WILL BE START IN 5s =====" + "LOOP KE-" + x);
//                Thread.sleep(5000);
//                StringSelection stringSelection = new StringSelection(lulu + x);
//                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
//                clipboard.setContents(stringSelection, null);
//
//                robot.keyPress(KeyEvent.VK_CONTROL);
//                robot.keyPress(KeyEvent.VK_V);
//                robot.keyRelease(KeyEvent.VK_CONTROL);
//                robot.keyRelease(KeyEvent.VK_V);
//
//                robot.keyPress(KeyEvent.VK_ENTER);TESTING LAGI KE-17

//                robot.keyRelease(KeyEvent.VK_ENTER);
//                x--;
//        }
//        System.out.println("============= DELAY1 ===========");
//        Thread.sleep(300000);
        int y = 500;
        while (y >= 1) {
            System.out.println("====== THE SPAMMING WILL BE START IN 5s =====" + "LOOP KE-" + y);
            Thread.sleep(100);
            StringSelection stringSelection = new StringSelection(lulu);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);

            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            y--;

        }
//        System.out.println("============= DELAY2 ===========");
//        Thread.sleep(300000);
//
//        int z = x-18;
//        while ( z >= 1) {
//            System.out.println("====== THE SPAMMING WILL BE START IN 5s =====" + "LOOP KE-" + z);
//            Thread.sleep(5000);
//            StringSelection stringSelection = new StringSelection(lulu + z);
//            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
//            clipboard.setContents(stringSelection, null);
//
//            robot.keyPress(KeyEvent.VK_CONTROL);
//            robot.keyPress(KeyEvent.VK_V);
//            robot.keyRelease(KeyEvent.VK_CONTROL);
//            robot.keyRelease(KeyEvent.VK_V);
//
//            robot.keyPress(KeyEvent.VK_ENTER);
//            robot.keyRelease(KeyEvent.VK_ENTER);
//            z--;
//        }
        System.out.println("============= END PROCESS ===========");
    }
}
