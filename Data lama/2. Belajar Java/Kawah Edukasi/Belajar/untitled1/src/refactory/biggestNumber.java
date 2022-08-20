package refactory;

import java.util.Arrays;

public class biggestNumber {
    public static void main(String[] args) {
        System.out.println("Hello World");
        maxRedigit(123) ;
        maxRedigit(231) ;
        maxRedigit(321) ;
        maxRedigit(-1)  ;
        maxRedigit(0)   ;
        maxRedigit(99)  ;
        maxRedigit(1000);
    }

    private static void maxRedigit(int inputAngka) {
        String s = String.valueOf(inputAngka);
        char[] ch=s.toCharArray();
        try {
            if (ch.length <=3 && inputAngka>99) {
                Arrays.sort(ch);
                for (int i = ch.length - 1; i >= 0; i--) {
                    System.out.print(ch[i]);
                    if (i==0){
                        System.out.println("");
                    }
                }
            }else{
                System.out.println("null");
            }
        }catch (Exception e){
            System.out.println("null");
        }
    }
}
