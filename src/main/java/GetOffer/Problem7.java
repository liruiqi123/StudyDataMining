package GetOffer;

import java.util.Stack;

/**
 * Created by liyaoshi on 2017/7/4.
 * 问题描述：用两个栈实现一个队列，实现对两个函数，appendTail和deleteHead
 *           分别完成在队列尾插入结点和在队列头部删除节点
 */
public class Problem7<T> {
    public Stack<T>  stack1 = new Stack<T>();
    public Stack<T>  stack2 = new Stack<T>();

    public void appendTail(T node){
        stack1.push(node);
    }

    public T deleteHead() throws Exception {
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }

        }
        if(stack2.isEmpty()) {
            throw new Exception("队列为空，不能删除");
        }

        return stack2.pop();

    }
}
