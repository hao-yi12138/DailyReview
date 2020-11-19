package MySort;

import java.util.Stack;

/**
 * @program: IntelliJ IDEA
 * @description:快速排序
 * @author: HAOYI
 * @date:2020-11-17 21:05
 **/
public class QuickSort {
    //非递归
    public static void quickSort2(int[] array){
        Stack<Integer> stack = new Stack<>();
        int left = 0;
        int right = array.length-1;
        int par = partition(array,left,right);
        if(par > left+1){
            stack.push(left);
            stack.push(par-1);
        }
        if(par < right-1){
            stack.push(par+1);
            stack.push(right);
        }
        while(!stack.empty()){
            right = stack.pop();
            left = stack.pop();
            par = partition(array,left,right);
            if(par > left+1){
                stack.push(left);
                stack.push(par-1);
            }
            if(par < right-1){
                stack.push(par+1);
                stack.push(right);
            }
        }
    }
    public static int partition ( int[] array, int left, int right){
        int pivot = array[left];
        while(left < right){
            while (left < right && array[right] >= pivot){
                right--;
            }
            array[left] = array[right];
            while (left < right && array[left] <= pivot){
                left++;
            }
            array[right] = array[left];
        }
        array[left] = pivot;
        return left;
    }
    //选基准值，将数据分为两部分，比基准值小的放到基准值左边，比基准值大的放到基准值右边
    //递归
    public static void quickSort(int[] array){
        quickSortInternal(array, 0, array.length - 1);
    }

    private static void quickSortInternal(int[] array, int low, int high) {
        int size = high - low + 1;
        if(size <= 1){
            return;
        }
        int pivot = array[low];
        int right = high;
        int left = low;
        while(left < right){
            while (left < right && array[right] >= pivot){
                right--;
            }
            array[left] = array[right];
            while (left < right && array[left] <= pivot){
                left++;
            }
            array[right] = array[left];
        }
        array[left] = pivot;
        // [low, left - 1]
        quickSortInternal(array, low, left - 1);
        // [left + 1, high]
        quickSortInternal(array, left + 1, high);
    }
}
