package Main;

import java.util.Scanner;

/**
 * @author jinhong
 * @date 2026/7/20 22:07
 * @description
 */
public class test0720 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int Sum=0;
        for (int i=1;i<=n;i++) {
            if (i % 2 != 0) {
                Sum += i;

                System.out.print(i + "");


            }
        }
    System.out.println();
        System.out.println(Sum);
    }


    }

