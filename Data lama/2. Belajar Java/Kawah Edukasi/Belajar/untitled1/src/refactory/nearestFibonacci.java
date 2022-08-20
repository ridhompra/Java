package refactory;

public class nearestFibonacci {
    public static void main(String[] args) {
        int [] arr = {15,1,3};
        int sum = 0;

        for(int i=0; i< arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
        fibonacci(sum);

    }
        public static void fibonacci(int sum) {
            int n1 = 0, n2 = 1, n3, i, count = 10;

            for (i = 2; i < count; ++i)            {
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
                if (n3 >= sum+2){
                    int result = n3 - sum;
                    System.out.println(result);
                    break;
                }
            }

        }


    }
