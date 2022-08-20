package com.belajar;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class s {
    public static void main(String[] args) {
        int [] num = new int[5];
//        errorNum(num);
        aritmathic();
        System.out.println("========END PROGRAM==========");
    }
    public static void errorNum(int [] nums){
    nums [10] = 25;
    }

    public static void aritmathic (){
        int nomor [] = {4,8,18,15};
        int numbers[] = {4,0,9,5};

        for(int i = 0 ; i < nomor.length; i++){
            try {
                System.out.println(nomor[i] / numbers[i]);
            }catch (Exception e){
                System.out.println("you can`t devide Zero !");
                return;
            }
            finally {
                String e = "lalalla";
                System.out.println(e);
            }
        }



        }
}
