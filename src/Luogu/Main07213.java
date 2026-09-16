package Luogu;

import java.util.Scanner;

/**
 * @author jinhong
 * @date 2026/7/21 22:01
 * @description
 */
public class Main07213 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        double c= sc.nextDouble();
        double p=(a+b+c)/2;
        double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.printf("%.1f\n",p);
        sc.close();
    }
}
