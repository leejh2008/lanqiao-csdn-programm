package Luogu;
//小鱼的数字游戏
import java.util.Scanner;

/**
 * @author jinhong
 * @date 2026/8/4 14:42
 * @description
 */
public class Main08041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int count = 0;
        int num = sc.nextInt();
        while (num != 0) {
            arr[count] = num;
            count++;
            num = sc.nextInt();
        }
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
