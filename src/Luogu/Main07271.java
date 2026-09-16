package Luogu;
//分类平均

import java.util.Scanner;

/**
 * @author jinhong
 * @date 2026/7/27 11:06
 * @description
 */
public class Main07271 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=sc.nextInt();


        int[] arr = new int[n];
            for (int i=0;i<n;i++){
                arr[i]=i+1;
            }
            int c1=0,c2=0;
            double s1=0,s2=0;
            for (int i=0;i<n;i++){
                int num=arr[i];
                if (num%k==0){
                    c1++;
                    s1+=num;
                }else{
                    c2++;
                    s2+=num;
                }}
                double ave1=s1/c1;
                double ave2=s2/c2;
                System.out.printf("%.1f %.1f",ave1,ave2);
                sc.close();


    }
}
