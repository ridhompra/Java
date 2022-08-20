package OOP;

public class buildStar {
    public static void main(String[] args) {
        int t,b,s;
        /*
        build
        *
        * *
        * * *
        * * * *
         */
        for (t= 1 ; t <=10 ; t++){
            for (b = 1 ; b<= t ; b++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        /*
        build
        build
           *
          * *
         * * *
        * * * *
         */
        for (t = 1 ; t <= 10 ; t ++){
            for (s = 10 - t ; s >0 ; s--){
                System.out.print(" ");
            }
            for (b = 1 ; b<=t ; b++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        /*
        build
        build
              *
            * *
          * * *
        * * * *
         */
        for (t = 1 ; t<=10 ; t++){
            for (s = 10 - t; s>0;s-- ){
                System.out.print("  ");
            }
            for (b = 1 ; b<=t ; b++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (t = 1 ; t<=10 ; t++){
            for (s = 1; s<t ; s++){
                System.out.print(" ");
            }
            for (b=10-t ; b>=0 ; b--){
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (t=1 ; t<=10 ; t++){
            for (s= 1 ; s<t ; s++){
                System.out.print("  ");
            }
            for (b=10-t ; b>0 ;b-- ){
                System.out.print("* ");

            }
            System.out.println("");
        }
        for (t = 1 ; t<=10 ; t++){
            for(b = 10 - t ; b>0 ; b--){
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (t = 1 ; t<=10 ; t++){
            for(b = 10 ; b>0 ; b--) {
                 if (b ==1) {
                     System.out.print("* ");
                 }else if (t==1){
                     System.out.print("* ");
                }else {
                     System.out.print("");
                 }
            }
            System.out.println("");
        }
    }
    }


