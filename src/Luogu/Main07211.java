package Luogu;

import java.util.Scanner;


public class Main07211 {
    //字母转换
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        System.out.println((char)(c-32));
        sc.close();
    }
}
