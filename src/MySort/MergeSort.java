package MySort;

/**
 * @program: IntelliJ IDEA
 * @description:归并排序
 * @author: HAOYI
 * @date:2020-11-20 15:02
 **/
public class MergeSort {
    //非递归
    public static void mergeSort2 ( int[] array){
        for (int gap = 1; gap <array.length ; gap*=2) {
            mergeNor(array,gap);
        }
    }
    public static void mergeNor(int[]array,int gap) {
        int[] ret = new int[array.length];
        int k = 0;
        int s1 = 0;
        int e1 = s1 + gap - 1;
        int s2 = e1 + 1;
        int e2 = s2 + gap - 1 < array.length ? s2 + gap - 1 : array.length - 1;
        while (s2 < array.length) {
            while (s1 <= e1 && s2 <= e2) {
                if (array[s1] <= array[s2]) {
                    ret[k++] = array[s1++];
                } else {
                    ret[k++] = array[s2++];
                }
            }
            while (s1 <= e1) {
                ret[k++] = array[s1++];
            }
            while (s2 <= e2) {
                ret[k++] = array[s2++];
            }
            s1 = e2+1;
            e1 = s1+gap-1;
            s2 = e1+1;
            e2 = s2 + gap - 1 < array.length ? s2 + gap - 1 : array.length - 1;
        }
        while (s1 < array.length){
            ret[k++] = array[s1++];
        }
        for (int i = 0; i <ret.length ; i++) {
            array[i] = ret[i];
        }
    }
    public static void mergeSort(int[] array){
           mergeSortInternal(array,0,array.length-1);
    }
    private static void mergeSortInternal(int[] array,int left,int right){
             int size = right - left + 1;
             if(size <= 1){
                 return;
             }
             int mid = (left + right)/2;
              //找到中间的值分为两个区间，用递归去接着拆分
             mergeSortInternal(array,left,mid);
             mergeSortInternal(array,mid+1,right);
              //合并两个有序区间
             int[] newArray = new int[size];
             int leftIndex = left;
             int rightIndex = mid+1;
             int newIndex = 0;

           while (leftIndex <= mid && rightIndex <= right){
               if(array[leftIndex] <= array[rightIndex]){
                   newArray[newIndex++] = array[leftIndex++];
               }else{
                   newArray[newIndex++] = array[rightIndex++];
               }
           }
           //有一个区间的数已经被取完，把剩余的有数的区间的元素放到newArray中
           if(leftIndex <= mid){
               while (leftIndex <= mid){
                   newArray[newIndex++] = array[leftIndex++];
               }
           }else {
               while (rightIndex <= right){
                   newArray[newIndex++] = array[rightIndex++];
               }
           }
           //把数据放回数组array中
        for (int i = 0; i < size ; i++) {
            int arrayIndex = i + left;
            array[arrayIndex] = newArray[i];
        }
    }
}
