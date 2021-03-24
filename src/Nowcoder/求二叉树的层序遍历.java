package Nowcoder;

import java.util.ArrayList;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: HAOYI
 * @date:2021-03-23 21:30
 **/
   class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
  }
public class 求二叉树的层序遍历 {
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        ArrayList<ArrayList<Integer>>  arr = new ArrayList<>();
        if(root == null){
            return arr;
        }
        ArrayList<TreeNode> arrayList = new ArrayList<>();
        arrayList.add(root);
        while (!arrayList.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
             int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                TreeNode root2 = arrayList.get(0);
                if(root2.left != null){
                    arrayList.add(root2.left);
                }
                if(root2.right != null){
                    arrayList.add(root2.right);
                }
                list.add(root2.val);
                arrayList.remove(0);
            }
            arr.add(list);
        }
        return arr;
    }
}
