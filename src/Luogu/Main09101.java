package Luogu;
import java.util.Scanner;
//蓝桥初赛题目：故障巡线机器人

public class Main09101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str=scan.next();
        //全部？换成R,用position记录当前所在的位置
        int position=0;
        //记录将？换成R后检测过程中所到达的最小位置或最大位置
        int minR=0,maxR=0;
        //逐个遍历每一个字符串的下标，i为下标，初始值是0；
        for(int i=0;i<str.length();i++) {
            //取出字符串中的第i位字符，存入ch中
            char ch = str.charAt(i);
            //如果ch是？，就全部换成R
            if (ch == '?') {
                ch = 'R';
            }
            //记录位置逻辑：如果ch为R，位置position+1；如果ch为L，位置position-1；如果是S不动，无需操作；
            if (ch == 'R') {
                position++;
            } else if (ch == 'L') {
                position--;
            }
            //如果当前位置比该状态下记录的最小值还要小，就更新最小下标
            if (position < minR) {
                minR = position;
            }
            //如果当前位置比该状态下记录的最大值还要大，就更新最大下标
            if (position > maxR) {
                maxR = position;
            }
        }
        //numR记录将？全部赋值为R情况下走过格子的总数
            int numR=maxR-minR+1;

        //与以上方法类似，先将position清空为0，记录将？赋值为R的情况下走过格子总数numL的值；
         position=0;
        int minL=0,maxL=0;
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if (ch == '?') {
                ch = 'L';
            }
            if (ch == 'R') {
                position++;
            } else if (ch == 'L') {
                position--;
            }
            if (position < minL) {
                minL = position;
            }
            if (position > maxL) {
                maxL = position;
            }
        }
            int numL=maxL-minL+1;
        //定义ans，用来打印最后的输出结果
        int ans;
        //比较选取numR与numL之中最大的那个，赋值给ans
        if(numR>numL){
            ans=numR;
        }else {
            ans=numL;
        }
        //打印结果
        System.out.println(ans);
        //关闭Scanner
        scan.close();
    }
}