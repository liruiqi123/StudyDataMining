package DataMining;

import java.util.*;

/**
 * Created by liyaoshi on 2017/6/26.
 */
public class ID3 {
    public static double getCalcShannonEnt(HashSet<int[]> dataSet){
        double Ent  = 0.0;
        //输入数据集的属性值和标签值作
        //为元素放在数组中，暂时定为四个属性，一个标签
        int length = 5;
        Set<Integer> status =  new HashSet<Integer>();
        Iterator iterator = dataSet.iterator();
        while (iterator.hasNext()){
            int[] arrary = (int[])iterator.next();
            if((null!=arrary)&&(arrary.length>4))
                status.add(arrary[4]);
        }




        return  Ent ;

    }
}
