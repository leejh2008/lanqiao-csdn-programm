package Luogu;

import java.util.Scanner;

/**
 * @author jinhong
 * @date 2026/8/28 11:11
 * @description蛇形方阵
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int num = 1;
        int left = 0, right = n - 1, up = 0, down = n - 1;
        //一定要加while循环，不然只能执行一轮！
        while (num <= n * n) {
            //从左向右
            for (int i = left; i <= right; i++) {
                arr[up][i] = num++;

            }
            up++;//上边的行要逐渐加1
            //从上到下
            for (int i = up; i <= down; i++) {
                arr[i][right] = num++;
            }
            right--;//右边的列要逐渐减1
            //从右到左
            for (int i = right; i >= left; i--) {
                arr[down][i] = num++;
            }
            down--;
            //从下到上
            for (int i = down; i >= up; i--) {
                arr[i][left] = num++;
            }
            left++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //保留3位字符，右对齐
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
    }

}
