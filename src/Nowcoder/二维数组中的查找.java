package Nowcoder;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: HAOYI
 * @date:2021-04-09 21:30
 **/

/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 * [
 *   [1,2,8,9],
 *   [2,4,9,12],
 *   [4,7,10,13],
 *   [6,8,11,15]
 * ]
 * 给定 target = 7，返回 true。
 * 给定 target = 3，返回 false。
 */
public class 二维数组中的查找 {
    public boolean Find1(int target, int [][] array) {
        for(int i = 0;i < array.length;i++){
            for(int j = 0;j < array[i].length;j++){
                if(array[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
    //从左下找
    public boolean Find2(int target,int [][] array){
        int rows= array.length;
        int cols = array[0].length;
        int i = rows-1,j = 0;
        while (i >= 0 && j < cols){
             if(array[i][j] > target){
                  i--;
             }else if(array[i][j] < target){
                 j++;
             }else {
                 return true;
             }
        }
        return false;
    }
}
