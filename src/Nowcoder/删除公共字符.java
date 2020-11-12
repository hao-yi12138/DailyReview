package Nowcoder;

import java.util.Scanner;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: HAOYI
 * @date:2020-11-12 21:21
 **/

/**
 * 输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。
 * 例如，输入”They are students.”和”aeiou”，则删除之后的第一个字符串变成”Thy r stdnts.”
 */
public class 删除公共字符 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String pattern = "[" + s2 + "]";
            String result = s1.replaceAll(pattern, "");
            System.out.println(result);
        }
    }
    public static void main1(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            char[] ch = sc.nextLine().toCharArray();
            String str = sc.nextLine();
            for(int i=0;i<ch.length;i++){
                if(!str.contains(String.valueOf(ch[i]))){
                    System.out.print(ch[i]);
                }
            }
        }
    }
}
