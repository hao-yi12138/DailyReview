package Nowcoder;

import java.util.Scanner;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: HAOYI
 * @date:2020-12-02 15:45
 **/

/**
 * 正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，
 * 设计一个算法，求输入A和B的最小公倍数。
 */
public class 求最小公倍数 {
    //最小公倍数 = 两数乘积 / 最大公约数
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        System.out.println(lcm(A,B));
    }
    public static int lcm(int A,int B){
        return (A*B)/gcd(A,B);
    }
    public static int gcd(int A,int B){
        //辗转相除法
        if(B == 0) return A;
        return gcd(B,A%B);
    }
}
