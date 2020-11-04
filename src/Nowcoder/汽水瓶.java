package Nowcoder;

import java.util.Scanner;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: HAOYI
 * @date:2020-11-03 19:51
 **/

/**
 * https://www.nowcoder.com/practice/fe298c55694f4ed39e256170ff2c205f?tpId=37&&tqId=21245&rp=1&ru
 * =/activity/oj&qru=/ta/huawei/question-ranking
 * 来源：牛客网
 * 有这样一道智力题：“某商店规定：三个空汽水瓶可以换一瓶汽水。小张手上有十个空汽水瓶，
 * 她最多可以换多少瓶汽水喝？”答案是5瓶，方法如下：先用9个空瓶子换3瓶汽水，喝掉3瓶满的，
 * 喝完以后4个空瓶子，用3个再换一瓶，喝掉这瓶满的，这时候剩2个空瓶子。然后你让老板先借给你一瓶汽水，
 * 喝掉这瓶满的，喝完以后用3个空瓶子换一瓶满的还给老板。如果小张手上有n个空汽水瓶，
 * 最多可以换多少瓶汽水喝？
 */
public class 汽水瓶 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n;
        while(s.hasNext()){
            n = s.nextInt();
            if(n!=0){
                System.out.println(drink(n));
            }
        }
    }
    public static int drink(int n){
        int water = 0;
        while(n > 2){
            water += n/3;
            n = n/3+n%3;
        }
        if(n==2){
            water += 1;
        }
        return water;
    }
}
