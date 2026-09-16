package Luogu;

import java.util.Scanner;

/**
 * @author jinhong
 * @date 2026/8/28 14:39
 * @description珠心算
 */
public class Main08311 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        boolean[] flag = new boolean[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int j = 0; j < n; j++) {
            for (int k = j + 1; k < n; k++) {
                int sum = a[j] + a[k];
                for (int i = 0; i < n; i++) {
                    if (a[i] == sum) {
                        flag[i] = true;
                    }
                }
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (flag[i]) {
                count++;
            }

        }
        System.out.println(count);
    }
}
