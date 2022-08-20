package refactory;

public class binary {
    public static void main(String[] args) {
        getMiddleAlphabet("q","u");
        getMiddleAlphabet("r","u");
        getMiddleAlphabet("t","z");
        getMiddleAlphabet("q","z");
    }
    public static void getMiddleAlphabet(String input1, String input2) {
        double s = Integer.valueOf(convertToIn(input1));
        double t = Integer.valueOf(convertToIn(input2));
        double mid = (s + t) / 2;
        int mid2 = (int)(s + t) / 2;
        if(mid== mid2){
            System.out.println(getCharForNumber(mid));
        }else {
            System.out.print(getCharForNumber(mid-0.5));
            System.out.print(getCharForNumber(mid+0.5)+"\n");
        }
    }
    private static String getCharForNumber(double i) {
        return i > 0 && i < 27 ? String.valueOf((char)(i + 64)) : null;
    }
    public static String convertToIn(String s) {
        String t = "";
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (!t.isEmpty()) {
                t += " ";
            }
            int n = (int) ch - (int) 'a' + 1;
            t += String.valueOf(n);
        }
        return t;
    }

}