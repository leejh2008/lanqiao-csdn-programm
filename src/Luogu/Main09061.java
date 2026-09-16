package Luogu;

import java.util.Scanner;

/**
 * @author jinhong
 * @date 2026/9/6 21:36
 * @description梦中的统计
 */
public class Main09061 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
        int[]count=new int[10];
        for(int i=M;i<=N;i++){
            int x=i;
            while (x>0){
                int d=x%10;
                count[d]++;
                x=x/10;
            }
        }
        for (int i=0;i<10;i++){

                System.out.print(count[i]+" ");
            }

        }
    }


