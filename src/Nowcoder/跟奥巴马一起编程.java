package Nowcoder;

import java.util.Scanner;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: HAOYI
 * @date:2020-12-08 11:08
 **/

/**
 * 输出由给定字符C画出的正方形。但是注意到行间距比列间距大，
 * 所以为了让结果看上去更像正方形，我们输出的行数实际上是列数的50%
 * （四舍五入取整）。
 * 输入
 * 10 a
 * 输出
 * aaaaaaaaaa
 * a        a
 * a        a
 * a        a
 * aaaaaaaaaa
 */
public class 跟奥巴马一起编程 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String c = s.next();
        //第一行
        for(int i = 0;i < n; i++){
            System.out.print(c);
        }
        System.out.println();
        double l = Math.ceil((double)n/2) - 2;//int l = Math.round((float)n/2) - 2;
        for(int i = 0;i < l;i++){
            System.out.print(c);
            for(int j = 0;j < n-2;j++){
                System.out.print(" ");
            }
            System.out.println(c);
        }
        for(int i = 0;i < n; i++){
            System.out.print(c);
        }
    }
}
