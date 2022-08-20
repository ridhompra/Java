package refactory;

public class alternateCase {
    public static void main(String[] args) {
    alternateCase("abc");
    alternateCase("ABC");
    alternateCase("Hello World");
    }
    private static void alternateCase(String input){
        input = input.toLowerCase();
        char[] ch = input.toCharArray();
        for (int i = 0; i < ch.length; i = i + 2) {
            ch[i] = Character.toUpperCase(ch[i]);
        }
        System.out.println(new String(ch));
    }
}
