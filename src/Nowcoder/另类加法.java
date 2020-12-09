package Nowcoder;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: HAOYI
 * @date:2020-12-09 20:37
 **/

/**
 * 给定两个int A和B。编写一个函数返回A+B的值，但不得使用+或其他算数运算符。
 */
public class 另类加法 {
    public int addAB(int A, int B) {
        if(B == 0) return A;
        int add1 = A^B;  //相加不进位
        int add2 = (A&B) << 1; //进位
        return addAB(add1,add2);
    }
    /*
       位的异或运算跟求'和'的结果一致：
        异或 1^1=0 1^0=1 0^0=0
        求和 1+1=0 1+0=1 0+0=0

       位的与运算跟求'进位‘的结果一致：
      位与 1&1=1 1&0=0 0&0=0
      进位 1+1=1 1+0=0 0+0=0
     */
}
