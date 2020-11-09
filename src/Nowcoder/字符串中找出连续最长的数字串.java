package Nowcoder;

import java.util.Scanner;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: HAOYI
 * @date:2020-11-09 21:18
 **/

/**
 * 读入一个字符串str，输出字符串str中的连续最长的数字串
 * 示例1
 * 输入
 * abcd12345ed125ss123456789
 * 输出
 * 123456789
 */
public class 字符串中找出连续最长的数字串 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int max = 0;
        int count = 0;
        int end = 0;
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                   count++;
                   if(max<count){
                       max=count;
                       end = i;
                   }
            }else {
                count=0;
            }
        }
        System.out.println(s.substring(end-max+1,end+1));
    }
}
