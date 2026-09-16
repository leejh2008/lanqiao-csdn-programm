package Luogu;

import java.util.Scanner;

/**
 * @author jinhong
 * @date 2026/9/1 15:05
 * @description 旗鼓相当的对手
 */
public class Main09011 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N=sc.nextInt();
        int[][]score=new int[N][3];
        for (int i=0;i<N;i++){
            score[i][0]=sc.nextInt();
            score[i][1]=sc.nextInt();
            score[i][2]=sc.nextInt();
        }
        int count=0;
        for (int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                int Yu=Math.abs(score[i][0]-score[j][0]);
                int Shu=Math.abs(score[i][1]-score[j][1]);
                int Ying=Math.abs(score[i][2]-score[j][2]);
                int sum1=score[i][0]+score[i][1]+score[i][2];
                int sum2=score[j][0]+score[j][1]+score[j][2];
                int sum=Math.abs(sum1-sum2);
                if(Yu<=5&&Shu<=5&&Ying<=5&&sum<=10){
                    count++;
                }
            }

        }
        System.out.println(count);
    }
}
