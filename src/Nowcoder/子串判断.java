package Nowcoder;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: HAOYI
 * @date:2021-01-06 19:17
 **/

/**
 * 链接：https://www.nowcoder.com/questionTerminal/917a800d4de1423394827932f4725c68
 * 来源：牛客网
 *
 * 给定一个string数组p及其大小n，同时给定长字符串string s，请返回一个bool数组，
 * 元素为true或false对应p中的对应字符串是否为s的子串。要求p中的串长度小于等于8，
 * 且p中的串的个数小于等于500，同时要求s的长度小于等于1000。
 *
 * 测试样例：
 * ["a","b","c","d"],4,"abc"
 * 返回：[true,true,true,false]
 */
public class 子串判断 {

    public boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        boolean[] arr = new boolean[p.length];
        for(int i = 0;i < p.length;i++){
            arr[i] = s.contains(p[i]);
        }
        return arr;
    }
}
