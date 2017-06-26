package LanguageJ;

/**
 * Created by liyaoshi on 2017/6/26.
 */
public class StaticSingleton {
    private StaticSingleton() {
        System.out.println("静态单例类正在被创建");
    }

    private static  class  SingletonHolder{
        private static  StaticSingleton instance = new StaticSingleton();
    }

    public  static  StaticSingleton getInstance(){
        return SingletonHolder.instance;
    }
}
