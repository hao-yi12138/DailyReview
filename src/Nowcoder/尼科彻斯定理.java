package Nowcoder;

import java.util.Scanner;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: HAOYI
 * @date:2020-12-09 10:29
 **/

/**
 * 链接：https://www.nowcoder.com/questionTerminal/dbace3a5b3c4480e86ee3277f3fe1e85
 * 来源：牛客网
 *
 * 验证尼科彻斯定理，即：任何一个整数m的立方都可以写成m个连续奇数之和。
 *
 * 例如：
 *
 * 1^3=1
 *
 * 2^3=3+5
 *
 * 3^3=7+9+11
 *
 * 4^3=13+15+17+19
 *
 * 输入一个正整数m（m≤100），将m的立方写成m个连续奇数之和的形式输出。
 * 本题含有多组输入数据。
 */
public class 尼科彻斯定理 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            int m = s.nextInt();
            int a = m * m - m + 1;
            System.out.print(a);
            for(int i = 1;i < m;i++){
                System.out.print("+"+(a+=2));
            }
            System.out.println();
        }
    }
}
