package Luogu;

import java.util.Scanner;

/**
 * @author jinhong
 * @date 2026/9/3 21:42
 * @description 彩票摇奖
 */
public class Main09031 {
    //程序主入口
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入购入的彩票张数n
        int n = sc.nextInt();
        //将中奖的号码存入isWin数组中，设置长度为34
        boolean[] isWin = new boolean[34];
        //在第二行输入中奖号码，并标记中奖号码为true
        for (int i = 0; i < 7; i++) {
            int num = sc.nextInt();
            isWin[num] = true;
        }
        //定义：win[0]为特等奖，win[1]为一等奖...以此类推
        //定义长度为7的数组用来存放输入的7个数据
        int[] win = new int[7];
        //依据n控制第二行以后输入的数据行数为n
        for (int t = 0; t < n; t++) {
            //设置计数器，记录每张彩票中奖号码的个数
            int count = 0;
            //输入每张彩票中的号码并依次遍历每张彩票中的号码
            for (int i = 0; i < 7; i++) {
                int x = sc.nextInt();
                //如果彩票中的号码与事先存入数组的中奖的号码相等
                if (isWin[x]) {
                    //个数+1
                    count++;
                }
            }
            //由题可知，由于输出时，从最左侧到最右侧代表特等（下标0），一等（下标1）...每张彩票中需要与中奖号码相等
            // 的个数为7、6、5、4、3、2、1
            //因此，打印出的数据的下标（index）应为每行输入数字个数（7）-每张彩票中需要与中奖号码相等的个数（count）
            if (count >= 1) {
                int index = 7 - count;
                //下标+1，打印下一个数据
                win[index]++;
            }
        }
        //遍历输出中奖张数
        for (int i = 0; i < 7; i++) {
            System.out.print(win[i]+" ");
        }
    }
}