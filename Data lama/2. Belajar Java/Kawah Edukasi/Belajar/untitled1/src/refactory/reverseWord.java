package refactory;

public class reverseWord {
    public static void main(String[] args) {
    reverse("I am a great Human");
    }
    public static void reverse(String input){
            String s="";
            char ch;

            System.out.println("Original word: "+ input);

            for (int i=0; i<input.length(); i++)
            {
                ch= input.charAt(i);
                s= ch+s;            }
            System.out.println("Reversed word: "+ s);
        }
    }


