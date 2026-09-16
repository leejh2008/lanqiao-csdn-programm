package Luogu;

import java.util.Scanner;

/**
 * @author jinhong
 * @date 2026/7/24 16:59
 * @description
 */
public class Main07241 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int r=sc.nextInt();
        double b=3.14*r*r*h;
        double t=20000/b;
        int ans=(int)Math.ceil(t);
        System.out.println(ans);

    }
}