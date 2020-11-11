package Nowcoder;

import java.util.Stack;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: HAOYI
 * @date:2020-11-11 20:14
 **/

/**
 * 链接：https://www.nowcoder.com/questionTerminal/d8acfa0619814b2d98f12c071aef20d4
 * 来源：牛客网
 *
 * 给定一个字符串A和其长度n，请返回一个bool值代表它是否为一个合法的括号串（只能由括号组成）。
 *
 * 测试样例：
 * "(()())",6
 * 返回：true
 * 测试样例：
 * "()a()()",7
 * 返回：false
 * 测试样例：
 * "()(()()",7
 * 返回：false
 */
public class 合法括号序列判断 {
    public boolean chkParenthesis(String A, int n) {
        Stack<Character> stack = new Stack<Character>();
        if(A == null || A.length() != n){
            return false;
        }
        for(int i = 0; i < n; i++){
            if(A.charAt(i) == '('){
                stack.push(A.charAt(i));
            }else if(A.charAt(i) == ')'){
                if(stack.empty()){
                    return false;
                }else{
                    stack.pop();
                }
            }else{
                return false;
            }
        }
        if(!stack.empty()){
            return false;
        }else{
            return true;
        }
    }
}
