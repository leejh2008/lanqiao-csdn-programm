package Luogu;

import java.util.Scanner;

/**
 * @author jinhong
 * @date 2026/7/27 21:40
 * @description
 */
public class Main07272 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int m=sc.nextInt();
        int []arr=new int[l+1];
        for (int i=0;i<m;i++){
            int s=sc.nextInt();
            int e=sc.nextInt();
            for (int j=s;j<=e;j++){
                arr[j]=1;
            }
        }
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(l+1-sum);
    }
}
