package LanguageJ.proxcy;

/**
 * Created by liyaoshi on 2017/6/30.
 */
public class DBQueryProxy implements IDBQuery {

    private DBQuery real = null ;


    public String request() {
        //当真正需要的时候，才创建真实的对象，创建过程可能比较缓慢
        if(real == null)
            real = new DBQuery();

        //在多线程环境下，这里返回一个虚假类，类似于future模式
        return  real.request();
    }
}
