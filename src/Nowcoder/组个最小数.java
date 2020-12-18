package Nowcoder;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: HAOYI
 * @date:2020-12-18 19:33
 **/

import java.util.Scanner;

/**
 * 链接：https://www.nowcoder.com/questionTerminal/86ede762b450404dbab59352963378e9
 * 来源：牛客网
 *
 * 给定数字0-9各若干个。你可以以任意顺序排列这些数字，但必须全部使用。目标是使得最后得到的数尽可能小
 * （注意0不能做首位）。例如：
 *
 * 给定两个0，两个1，三个5，一个8，我们得到的最小的数就是10015558。
 * 输入
 * 2 2 0 0 0 3 0 0 1 0
 * 输出
 * 10015558
 */
public class 组个最小数 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] num = new int[10];
        for (int i = 0; i < 10; i++) {
            num[i] = s.nextInt();
        }
        //第一位
        for (int i = 1; i < 10; i++) {
            if(num[i] != 0){
                System.out.println(i);
                num[i]--;
                break;
            }
        }
        //所有0
        while(num[0] != 0){
            System.out.println(0);
            num[0]--;
        }
        //剩下的依次输出
        for (int i = 1; i < 10; i++) {
            while(num[i] != 0){
                System.out.println(i);
                num[i]--;
            }
        }
    }
}
