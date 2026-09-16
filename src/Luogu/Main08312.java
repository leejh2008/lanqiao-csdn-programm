package Luogu;

import java.util.Scanner;

/**
 * @author jinhong
 * @date 2026/8/31 22:49
 * @description 冰雹猜想
 */
public class Main08312 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[200];//定义一个很大长度的arr数组，用来存放输入及计算好的数据
        int length=0;//length用来记录真实的数组个数
        int num=n;//用num保存输入的数字
        //使用true死循环，用break控制跳出循环
        while (true){
            arr[length]=num;//将输入或计算好的数存入数组中
            length++;//每存放一个数，数组中元素个数+1
            //1既不是质数，也不是偶数。若输入1则直接跳出循环，用break控制
            if(num==1){
                break;
            }
            //如果上一个计算好的结果取余2后恒等于0（即偶数）则进行下一步运算num=num/2
            if(num%2==0){
                num=num/2;
                //若是奇数，进行num=num*3+1运算
            }else {
                num=num*3+1;
            }
        }
        //从数组的末尾向前遍历，打印每一次运算的结果，记得用空格隔开
        for (int i=length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
