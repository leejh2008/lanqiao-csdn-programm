package Luogu;
    import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

    public class Main09081 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            //在此输入您的代码...
            int N = scan.nextInt();
            int[] count = new int[10];
            for (int i = 0; i < N; i++) {
                int color = scan.nextInt();
                count[color]++;

            }
            int max = 0;
            for (int i = 0; i <= 9; i++) {
                if (count[i] > max) {
                    max = count[i];
                }

            }
            System.out.println(N - max);

            scan.close();
        }
    }

