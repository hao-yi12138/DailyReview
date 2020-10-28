package Nowcoder;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: HAOYI
 * @date:2020-10-21 09:53
 **/

/**
 * 链接：https://www.nowcoder.com/questionTerminal/e016ad9b7f0b45048c58a9f27ba618bf
 * 来源：牛客网
 *
 * 有一个整数数组，请你根据快速排序的思路，找出数组中第K大的数。
 *
 * 给定一个整数数组a,同时给定它的大小n和要找的K(K在1到n之间)，请返回第K大的数，保证答案存在。
 *
 * 测试样例：
 * [1,3,5,2,2],5,3
 * 返回：2
 */
public class 寻找第K大 {
    public static void main(String[] args) {
        int[] a = {1,3,5,2,2};
        int n = 5;
        int K = 3;
        int i = findKth(a,n,K);
        System.out.println(i);
    }
    public static int findKth(int[] a, int n, int K) {
        // write code here
        return findKth(a,0,n-1,K);
    }
    public static int findKth(int[] a,int left,int right,int K){
        int part = partation(a, left, right);
        if(part-left+1 == K){    //如果 part-left+1==K成立，因为前半段有k - 1个大于a[part]的元素，
            return a[part];        //故a[part]为第K大的元素）
        }else if(part-left+1 > K){          //如果part-left+1 > K，证明第K大个元素在前半段
            return findKth(a,left,part-1,K);  //更新right = part-1
        }else{                                 //如果p - low + 1 < k， 则第k大的元素在后半段，
            return findKth(a,part+1,right,K-part+left-1);//此时更新left=part+1,
        }                                                     //且 K = K-(part - left + 1)
    }
    public static int partation(int[] a,int left,int right){
        int tmp = a[left];
        while(left < right){
            while(left<right&&a[right]<=tmp){
                right--;
            }
            a[left] = a[right];
            while(left<right&&a[left]>=tmp){
                left++;
            }
            a[right] = a[left];
        }
        a[left] = tmp;
        return left;
    }
}
