package LanguageJ;

/**
 * Created by liyaoshi on 2017/6/26.
 * 单例模式的延时加载
 */
public class LazySingleton {

    private LazySingleton(){
        System.out.println("延时加载单例正在被创建");
    }


    //此处将初始值设为空，在创建类时 可以不必新new，
    //若实际用到的话，再创建
    private static LazySingleton instance = null;


    //此处加入的同步关键字 ，又是反而会增加程序的消耗
    public static  synchronized LazySingleton getInstance() {
        if(instance==null)
            instance = new LazySingleton();
        return  instance;
    }
}
