package Nowcoder;

import java.util.Scanner;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: HAOYI
 * @date:2020-10-21 09:16
 **/

/**
 * 链接：https://www.nowcoder.com/questionTerminal/9d1559511b3849deaa71b576fa7009dc
 * 来源：牛客网
 *
 * A = “aba”，B = “b”。这里有4种把B插入A的办法：
 * * 在A的第一个字母之前: "baba" 不是回文
 * * 在第一个字母‘a’之后: "abba" 是回文
 * * 在字母‘b’之后: "abba" 是回文
 * * 在第二个字母'a'之后 "abab" 不是回文
 * 所以满足条件的答案为2
 */
public class 统计回文 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        int count = 0;
        for (int i = 0; i <= s1.length() ; i++) {
            String str = s1.substring(0,i)+s2+s1.substring(i,s1.length());//合并
            StringBuffer sb = new StringBuffer(str);
            if(sb.reverse().toString().equals(str)){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main1(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        int count = 0;
        for(int i = 0;i <= s1.length();i++){
            StringBuilder sb = new StringBuilder(s1);
            sb.insert(i, s2);
            if(isHuiwen(sb.toString())){
                count++;
            }
        }
        System.out.print(count);
    }
    public static boolean isHuiwen(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!= s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
