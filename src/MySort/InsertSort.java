package MySort;

/**
 * @program: IntelliJ IDEA
 * @description:插入排序
 * @author: HAOYI
 * @date:2020-11-17 11:02
 **/
//整个区间分为有序和无序,从无序数据中取出元素插入到有序数据的合适位置
public class InsertSort {
    public static void main(String[] args) {
        int[] array = {1,4,2,6,7};
        insertSort(array);
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]);
        }
    }
    public static void insertSort(int[] array){
        for (int i = 0; i < array.length -1 ; i++) {
            int k = array[i+1];//无序的数
            int j;
            for ( j = i; j >=0 && array[j] > k ; j--) {
                array[j+1] = array[j];
            }
            array[j+1] = k;
        }
    }
}
