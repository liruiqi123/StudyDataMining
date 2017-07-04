package LanguageJ.proxcy;

/**
 * Created by liyaoshi on 2017/6/30.
 */
public class DBQuery implements  IDBQuery{

    public DBQuery(){
        try {
            //在此处可能包含数据库连接等耗时操作
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public String request() {
        return "request string";
    }
}
