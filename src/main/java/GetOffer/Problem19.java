package GetOffer;

import java.util.Stack;

/**
 * Created by liyaoshi on 2017/7/5.
 * 题目描述 请完成一个函数，输入一个二叉树，该函数输出它的镜像
 */
public class Problem19 {
    public static  void main(String[] args){
        BinaryTreeNode root1 = new BinaryTreeNode();
        BinaryTreeNode root2 = new BinaryTreeNode();
        root2 = getNewTree(root1);
    }

    public static BinaryTreeNode getNewTree(BinaryTreeNode root){
        if(root==null)
            return null;
        if(root.leftNode!=null)
            getNewTree(root.leftNode);
        if(root.rightNode!=null)
            getNewTree(root.rightNode);
        BinaryTreeNode tmpTreeNode = new BinaryTreeNode();
        tmpTreeNode = root.leftNode;
        root.leftNode = root.rightNode;
        root.rightNode = tmpTreeNode;
        return root;
    }

    /**
     * 感觉该方法是用栈实现了前序遍历，实现了对树种节点的反转，
     * 通过栈实现前序遍历，在栈定储存当前根节点，同理，我的好像
     * 就是中序遍历
     * 但是还是没太明白，有机会重新捋一捋
     * @param root
     * @return
     */
    public BinaryTreeNode mirrorBinaryTree(BinaryTreeNode root){
        if(root==null){
            return null;
        }
        if(root.leftNode==null&&root.rightNode==null)
            return null;

        Stack<BinaryTreeNode> stack=new Stack<BinaryTreeNode>();
        while(root!=null||!stack.isEmpty()){
            while(root!=null){
                BinaryTreeNode temp=root.leftNode;
                root.leftNode=root.rightNode;
                root.rightNode=temp;
                stack.push(root);
                root=root.leftNode;
            }
            root=stack.pop();
            root=root.rightNode;
        }
        return root;
    }
}
