package refactory;

public class multiple3and5 {
    public static void main(String[] args) {
        int[] array = {3, 6, 9, 12, 15, 18};
        int sum = 0;
        //Advanced for loop
        for( int num : array) {
            sum = sum+num;
        }
        System.out.println("Jumlah Dari Semua Elemen Array Adalah:"+sum);
    }
}
