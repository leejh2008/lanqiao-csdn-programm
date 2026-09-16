package Luogu;

import java.util.Scanner;

/**
 * @author jinhong
 * @date 2026/7/21 21:46
 * @description
 */
public class Main07212 {
    //再分肥宅快乐水
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double t=sc.nextDouble();
        int n=sc.nextInt();
        double per=t/n;
        System.out.printf("%.3f\n",per);
        System.out.println(2*n);
        sc.close();

    }
}
