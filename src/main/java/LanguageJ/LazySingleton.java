package LanguageJ;

/**
 * Created by liyaoshi on 2017/6/26.
 * 单例模式的延时加载
 */
public class LazySingleton {

    private LazySingleton(){
        System.out.println("延时加载单例正在被创建");
    }

    private static LazySingleton instance = null;

    public static  synchronized LazySingleton getInstance() {
        if(instance==null)
            instance = new LazySingleton();
        return  instance;
    }
}
