package Nowcoder;

import java.util.Scanner;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: HAOYI
 * @date:2020-12-15 11:17
 **/

/**
 * 输入一个正整数n,求n!(即阶乘)末尾有多少个0？ 比如: n = 10; n! = 3628800,所以答案为2
 */
public class 末尾0的个数 {
    /*
  尾部所有的0都是由因子5*2得到的，由于2.6.8 都可以视为因子2，所以因子2的个数远大于因子5的个数所以
  只需要求出因子5的个数即可。由于25,125这个数不止含有一个因子5，所以需要用循环判断是否还包含因数5
    * */
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        for(int i = n;i >= 5;i--){
            int tmp = i;
            while(tmp%5==0){
                count++;
                tmp /= 5;
            }
        }
        System.out.println(count);
    }
}
