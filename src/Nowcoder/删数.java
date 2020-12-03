package Nowcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: HAOYI
 * @date:2020-12-03 16:06
 **/

/**
 * 有一个数组a[N]顺序存放0~N-1，要求每隔两个数删掉一个数，到末尾时循环至开头继续进行，
 * 求最后一个被删掉的数的原始下标位置。以8个数(N=7)为例:｛0，1，2，3，4，5，6，7｝，
 * 0->1->2(删除)->3->4->5(删除)->6->7->0(删除),如此循环直到最后一个数被删除。
 */
public class 删数 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            int n = s.nextInt();
            if(n > 1000){
                n = 999;
            }
            List<Integer> list = new ArrayList<Integer>();
            for(int i = 0;i < n;i++){
                list.add(i);
            }
            int i = 0;
            while(list.size() > 1){
                i = (i+2)%list.size();//循环
                list.remove(i);
            }
            System.out.println(list.get(0));
        }
    }
}
