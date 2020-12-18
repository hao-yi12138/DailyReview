package Nowcoder;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: HAOYI
 * @date:2020-12-18 10:35
 **/

import java.util.Arrays;
import java.util.Scanner;

/**
 * 找出n个数里最小的k个
 * 输入描述:
 * 每个测试输入包含空格分割的n+1个整数，最后一个整数为k值,n
 * 不超过100。
 * 输出描述:
 * 输出n个整数里最小的k个数。升序输出
 */
public class n个数里最小的k个 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            String s1 = s.nextLine();
            String[] sr = s1.split(" ");//空格分割
            int[] num = new int[sr.length-1];
            for (int i = 0; i < sr.length-1 ; i++) {
                  num[i] = Integer.parseInt(sr[i]);
            }
            int k = Integer.parseInt(sr[sr.length-1]);
            int left = 0;
            int right = num.length-1;
            int index = QSort(num,left,right);
            while(index != k){
                if(index > k) {
                    right = index - 1;
                    index = QSort(num, left, right);
                }else {
                    left = index+1;
                    index = QSort(num,left,right);
                }
            }
            Arrays.sort(num,0,k);
            for (int i = 0; i < k ; i++) {
                System.out.print(i == k-1 ? num[i]:num[i]+" ");
            }
        }
    }

    private static int QSort(int[] num, int left, int right) {
        int tmp = num[left];
        while(left < right){
            while(left < right && num[right] > tmp){
                right--;
            }
            num[left] = num[right];
            while(left < right && num[left] <= tmp){
                left++;
            }
            num[right] = num[left];
        }
        num[left] = tmp;
        return left;
    }
}
