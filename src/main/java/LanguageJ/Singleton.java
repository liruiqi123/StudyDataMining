package LanguageJ;

/**
 * Created by liyaoshi on 2017/6/26.
 */
public class Singleton {
    //必须有一个这个private级别的构造函数，只有这样，才能确保单列不会再代码的其他位置被实例化
    private Singleton () {
        System.out.println("单例已经创建");
    }

    //必须是static，缺点是没法对这个instanc对象进行延时加载，假如该对象创建会很慢
    private  static Singleton instance = new  Singleton();

    //必须是static
    public static  Singleton getInstance(){
        return instance;
    }
 }
