/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: HAOYI
 * @date:2021-03-19 21:43
 **/

/**
 * 给你一个整数 n，请返回长度为 n 、仅由元音 (a, e, i, o, u) 组成且按 字典序排列 的字符串数量。
 * 字符串 s 按 字典序排列 需要满足：对于所有有效的 i，s[i] 在字母表中的位置总是与 s[i+1]相同或在 s[i+1] 之前。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/count-sorted-vowel-strings
 */
public class 统计字典序元音字符串的数目 {
    public int countVowelStrings(int n) {
        int a=1,e=1,i=1,o=1,u=1;
        for(int k = 1;k < n;k++){
            a = a+e+i+o+u;
            e = e+i+o+u;
            i = i+o+u;
            o = o+u;
            u = u;
        }
        return  a+e+i+o+u;
    }
}
