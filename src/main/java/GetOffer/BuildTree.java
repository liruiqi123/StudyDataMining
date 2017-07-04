package GetOffer;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by liyaoshi on 2017/7/4.
 * 问题描述：输入某二叉树前序遍历和中序遍历的结果，请重建出该二叉树
 */
public class BuildTree {
    public static void main(String[] args){
        int [] preSort = {1,2,4,7,3,5,6,8};
        int [] inSort = {4,7,2,1,5,3,8,6};
        BinaryTreeNode root = constructCore(preSort,inSort);
    }

    public static BinaryTreeNode constructCore(int[] preOrder,int[] inOrder ){
        if(null==preOrder||null==inOrder)
            return null;
        if(preOrder.length!=inOrder.length)
            System.out.println("长度不一致，输入的参数有误");

        BinaryTreeNode root = new BinaryTreeNode();

        for(int i = 0; i<inOrder.length; i++){
            if(inOrder[i]==preOrder[i]){
                root.value = inOrder[i];
                System.out.println(root.value);
                root.leftNode = constructCore(Arrays.copyOfRange(preOrder, 1, i + 1),Arrays.copyOfRange(inOrder, 0, i));
                root.rightNode = constructCore(Arrays.copyOfRange(preOrder,i+2,preOrder.length+1),Arrays.copyOfRange(inOrder,i+1,inOrder.length+1));
            }
        }
         return root;
    }
}
