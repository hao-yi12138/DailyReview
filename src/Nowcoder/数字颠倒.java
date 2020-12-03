package Nowcoder;

import java.util.Scanner;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: HAOYI
 * @date:2020-12-03 21:13
 **/

/**
 * 输入一个整数，将这个整数以字符串的形式逆序输出
 * 程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 */
public class 数字颠倒 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str = "";
        while(n != 0){
            int a = n%10;
            n = n/10;
            str = str+String.valueOf(a);
        }
        System.out.println(str);
    }
}
