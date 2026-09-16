package Luogu;
//统计1-n中数字x一共出现多少次

import java.util.Scanner;


public class Main07244 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=i+1;
        }
        int count=0;
        for(int i=0;i<n;i++){
            int t=arr[i];
            while (t>0){
                int digit=t%10;
                if(digit==x){
                    count++;
                }
                t=t/10;
            }
        }
        System.out.print(count);
        sc.close();
    }
}
