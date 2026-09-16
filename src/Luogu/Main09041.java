package Luogu;

import java.util.Scanner;

/**
 * @author jinhong
 * @date 2026/9/3 22:46
 * @description显示屏
 */
public class Main09041 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        String [][]t={
                {"XXX","X.X","X.X","X.X","XXX"},
                {"..X","..X","..X","..X","..X"},
                {"XXX","..X","XXX","X..","XXX"},
                {"XXX","..X","XXX","..X","XXX"},
                {"X.X","X.X","XXX","..X","..X"},
                {"XXX","X..","XXX","..X","XXX"},
                {"XXX","X..","XXX","X.X","XXX"},
                {"XXX","..X","..X","..X","..X"},
                {"XXX","X.X","XXX","X.X","XXX"},
                {"XXX","X.X","XXX","..X","XXX"},
        };
        for(int l=0;l<5;l++){
            for(int i=0;i<n;i++){
                int d=s.charAt(i)-'0';
                System.out.print(t[d][l]);
if(i!=n-1){
    System.out.print('.');
}
            }
            System.out.println();
        }
    }
}
