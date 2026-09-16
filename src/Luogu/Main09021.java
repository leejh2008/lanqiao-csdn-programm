package Luogu;

import java.util.Scanner;

/**
 * @author jinhong
 * @date 2026/9/2 20:22
 * @description 工艺品制作
 */
public class Main09021 {
    //程序主入口
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //输入读取长宽高w、x、h
        int w=sc.nextInt();
        int x=sc.nextInt();
        int h=sc.nextInt();
        //输入读取切割次数q
        int q=sc.nextInt();
        //将坐标数据存入三维数组flag[t][j][k]
        //true表示该编号的小方块已被蒸发
        //由题意，方块的标号从1开始，故数组的长度+1，舍弃0下标
        boolean [][][]flag=new boolean[w+1][x+1][h+1];
        for(int i=0;i<q;i++){
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int z1=sc.nextInt();
            int x2=sc.nextInt();
            int y2=sc.nextInt();
            int z2=sc.nextInt();
            //遍历三维数组，将符合条件的小方块编号为true
            for (int t=x1;t<=x2;t++){//遍历x方向
                for (int j=y1;j<=y2;j++){//遍历y方向
                    for (int k=z1;k<=z2;k++){//遍历z方向
                        flag[t][j][k]=true;
                    }


                }
            }
        }
        int remain=0;//设置计数器，用来表示剩余的方块数
        //遍历全部存在的小方块编号
        for (int t=1;t<=w;t++){
            for (int j=1;j<=x;j++){
                for (int k=1;k<=h;k++){
                    //！flag[t][j][k]表示未被蒸发的小正方体被标记为false
                    if(!flag[t][j][k]){
                        remain++;
                    }
                }
            }
        }
        //打印输出剩余的小正方体个数
        System.out.println(remain);
                sc.close();


    }
}
