package LanguageJ.proxcy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by liyaoshi on 2017/6/30.
 */

//使用动态代理生成代理类
public class JDKDbQueryHandler implements InvocationHandler {
    IDBQuery real = null ;
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (real == null)
             real = new DBQuery();
        return real.request();
    }
}
