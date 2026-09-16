package Luogu;

import java.util.Scanner;

/**
 * @author jinhong
 * @date 2026/9/8 20:25
 * @description 新生保护计划
 */
public class Main09082 {
    public static int getSum(int x){
        int sum=0;
        while (x>0){
            sum=sum+x%10;
            x=x/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int day=0;
        while (n>0){
            int i=getSum(n);
            n=n-i;
            day++;
        }
        System.out.println(day);
        scan.close();
    }
}