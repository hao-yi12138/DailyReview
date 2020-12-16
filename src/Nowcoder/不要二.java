package Nowcoder;

import java.util.Scanner;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: HAOYI
 * @date:2020-12-03 19:52
 **/

/**
 * 链接：https://www.nowcoder.com/questionTerminal/1183548cd48446b38da501e58d5944eb
 * 来源：牛客网
 *
 * 二货小易有一个W*H的网格盒子，网格的行编号为0~H-1，网格的列编号为0~W-1。
 * 每个格子至多可以放一块蛋糕，任意两块蛋糕的欧几里得距离不能等于2。
 * 对于两个格子坐标(x1,y1),(x2,y2)的欧几里得距离为:
 * ( (x1-x2) * (x1-x2) + (y1-y2) * (y1-y2) ) 的算术平方根
 * 小易想知道最多可以放多少块蛋糕在网格盒子里。
 */
//就是每四行四列为一个周期相同如下的图案：
//＊＊    ＊＊   ＊＊
//＊＊    ＊＊   ＊＊
//    ＊＊   ＊＊   ＊＊
//    ＊＊   ＊＊   ＊＊
//＊＊    ＊＊   ＊＊
//＊＊    ＊＊   ＊＊
public class 不要二 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

            int W = s.nextInt();
            int H = s.nextInt();
            int count = 0;
            for (int i = 0; i < W ; i++) {
                if(i % 4 == 0 || i % 4 == 1){
                    for (int j = 0; j < H; j++) {
                        if(j % 4 == 0 || j % 4 == 1){
                            count++;
                        }
                    }
                }else{
                    for (int j = 0; j < H; j++) {
                        if(j % 4 == 2 || j % 4 == 3){
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
}
