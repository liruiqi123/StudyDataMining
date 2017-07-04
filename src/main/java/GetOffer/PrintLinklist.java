package GetOffer;

/**
 * Created by liyaoshi on 2017/7/4.
 * 问题描述：要求从尾到头输出打印链表
 * 从尾到头，先进后出，则可以考虑使用栈的数据结构来实现这一结构
 * 重点：考虑到递归的实现并且想到栈这个数据结构
 */
public class PrintLinklist {
    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.nextNode = node2;
        node2.nextNode = node3;
        printListReverse(node1);
    }

    public static void printListReverse(ListNode headnode){
        if(null!=headnode){
            if(null!=headnode.nextNode){
                printListReverse(headnode.nextNode);
            }
            System.out.println(headnode.val+"  ");
        }
        return;
    }
}
