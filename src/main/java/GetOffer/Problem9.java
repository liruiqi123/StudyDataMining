package GetOffer;

/**
 * Created by liyaoshi on 2017/7/4.
 * 实现斐波那契数列 ，并求第n项
 */
public class Problem9 {
    public static  void main(String[] args){
        for(int i =1; i<100;i++){
            System.out.println (Fib(i));
        }
    }

    public static int Fib(int n){
        if(n==1)
            return 0;
        else if(n==2)
            return 1;
        else{
           int F = Fib(n-1)+Fib(n-2);
            return(F);
        }
    }
}
