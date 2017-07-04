package LanguageJ;

/**
 * Created by liyaoshi on 2017/6/26.
 */
public class StaticSingleton {
    private StaticSingleton() {
        System.out.println("静态单例类正在被创建");
    }


    // 用内部类来维护单例的实现，当StaticSingleton被加载时，内部类并不会被初始化
   private static  class  SingletonHolder{
        private static  StaticSingleton instance = new StaticSingleton();
    }


    //调用该方法时 ，才会加载
    public  static  StaticSingleton getInstance(){
        return SingletonHolder.instance;
    }
}
