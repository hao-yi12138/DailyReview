package Nowcoder;

import java.util.Scanner;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: HAOYI
 * @date:2021-01-12 20:11
 **/

/**
 * 链接：https://www.nowcoder.com/questionTerminal/18ecd0ecf5ef4fe9ba3f17f8d00d2d66
 * 来源：牛客网
 *
 * Fibonacci数列是这样定义的：
 * F[0] = 0
 * F[1] = 1
 * for each i ≥ 2: F[i] = F[i-1] + F[i-2]
 * 因此，Fibonacci数列就形如：0, 1, 1, 2, 3, 5, 8, 13, ...，在Fibonacci数列中的数
 * 我们称为Fibonacci数。给你一个N，你想让其变为一个Fibonacci数，每一步你可以把
 * 当前数字X变为X-1或者X+1，现在给你一个数N求最少需要多少步可以变为Fibonacci数。
 */
public class Fibonacci数列 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int a = 0,b = 1,c = 1;
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
        }
        while (c < n) {
            a = b;
            b = c;
            c = a + b;
        }
        int dis1 = n - b;
        int dis2 = c - n;
        System.out.println(dis1 < dis2?dis1: dis2);
    }
}
