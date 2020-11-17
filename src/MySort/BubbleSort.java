package MySort;

/**
 * @program: IntelliJ IDEA
 * @description:冒泡排序
 * @author: HAOYI
 * @date:2020-11-17 10:42
 **/
public class BubbleSort {
    public static void main(String[] args) {
         int[] array = {1,4,2,6,7};
         MyBubbleSort(array);
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]);
        }
    }
    public static void MyBubbleSort(int[] array){
        for (int i = 0; i < array.length-1 ; i++) {
            boolean test = true;
            for (int j = 0; j <array.length-i-1 ; j++) {
                if(array[j]>array[j+1]){
                    int t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                    test = false;
                }
            }
            if(test){
                break;
            }
        }
    }
}
