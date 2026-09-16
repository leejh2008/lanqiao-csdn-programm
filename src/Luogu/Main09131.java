package Luogu;

import java.io.*;

/**
 * 蓝桥学院门禁码计数
 *
 * 题意：
 *   密码是长度恰好为 N 的字符串，每位只能是 'L' 或 'Q'；
 *   不能出现连续三个相同字符（即禁止子串 "LLL" 和 "QQQ"）。
 *   问长度为 N 的合法密码有多少个。
 *
 * 思路（动态规划 / 线性递推）：
 *   设 dp[i] = 长度为 i 的合法字符串个数。
 *   对一个长度为 i 的合法串，看它最后两位，只有两种情况：
 *
 *   情况一：末两位不同（LQ 或 QL）
 *       去掉最后一位，剩下的前 i-1 位仍然合法（去掉末尾不会新造出 LLL/QQQ）。
 *       反过来，任何长度为 i-1 的合法串，末尾接一个与它末位相反的字符，
 *       一定能得到末两位不同、且整体合法的新串。
 *       所以这一类恰好有 dp[i-1] 个。
 *
 *   情况二：末两位相同（LL 或 QQ）
 *       此时倒数第二位（和第 i 位相同）必须与倒数第三位不同，
 *       否则前三位就已经构成 LLL 或 QQQ 了。
 *       也就是说：前 i-2 位可以是任意合法串，末两位只能填「与第 i-2 位相反的那个字符」的重复。
 *       反过来，任何长度为 i-2 的合法串都能这样唯一地扩展成合法串。
 *       所以这一类恰好有 dp[i-2] 个。
 *
 *   （注意：末两位相同的情况不可能是由 i-1 位合法串扩展得到的，
 *     两类互不重叠、且覆盖全部情况，因此可以直接相加。）
 *
 *   递推式：dp[i] = dp[i-1] + dp[i-2]
 *   边界：  dp[1] = 2   (L, Q)
 *          dp[2] = 4   (LL, LQ, QL, QQ，长度 2 不可能出现三连)
 *
 * 复杂度：时间 O(N)，空间 O(1)（只保留最近两项，用滚动变量）。
 * 数据范围：N ≤ 30，答案最大为 dp[30] = 2692538，long 足够（int 也够）。
 *
 * 小结论：dp[n] = 2 * Fibonacci(n+1)，即斐波那契数列的两倍。
 */
public class Main09131 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());   // 读入密码长度 N

        // 边界情况：长度 1 和 2 时任何组合都合法，不可能凑出连续三个相同字符
        if (n == 1) { System.out.println(2); return; }     // L, Q
        if (n == 2) { System.out.println(4); return; }     // LL, LQ, QL, QQ

        // 滚动变量：a 代表 dp[i-2]，b 代表 dp[i-1]
        long a = 2;   // dp[1] = 2
        long b = 4;   // dp[2] = 4

        for (int i = 3; i <= n; i++) {
            long c = a + b;   // dp[i] = dp[i-1] + dp[i-2]
            a = b;            // 滚动前进：dp[i-1] 变成新的 dp[i-2]
            b = c;            // dp[i] 就是新的 dp[i-1]
        }

        // 循环结束后 b 保存的就是 dp[n]
        System.out.println(b);
    }
}
