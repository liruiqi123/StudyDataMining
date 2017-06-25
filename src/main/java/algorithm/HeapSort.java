package algorithm;

/**
 * Created by liruiqi on 2017/6/25.
 */
public class HeapSort {
    public  static  void  main(String[] args){
        //设置输入待排序的数组
        int[] array = getArray(50);
        //根据输入数组创建最大堆

        System.out.println("    ");
        buildMaxHeap(array,array.length);

        for(int i = array.length-1 ; i >0 ;i--){
            exchangeElements(array,i,0);
            buildMaxHeap(array,i);

        }


        for (int i = 0 ; i < array.length ; i++){
            System.out.print(array[i]+",");
        }

    }

    public static int[] getArray(int length){
        //设置数组长度
        //设置数据输入长度
        int [] array = new int[length];
        //设置随机数，将其输入数组中
        java.util.Random r = new java.util.Random();
        for (int i = 0 ; i < length ; i++){
            array[i] = r.nextInt(100);
        }
        System.out.println("当前输入的数组为");

        for (int i = 0 ; i < length ; i++){
            System.out.print(array[i]+",");
        }
        return array;
    }

    public static  void buildMaxHeap(int[] array,int length){
        //从最后一个非叶子节点进行堆创建
        int len = length>>1;
        for(int i = len ; i >0 ; i--){
            int left = (i<<1)-1;
            int right = left + 1;
            int largest = len-1;
            //排序后，要求根节点数值最大，左孩子右孩子无所谓拉
            if((length>left)&&(array[left]>array[largest]))
                largest=left;
            if((length>right)&&(array[right]>array[largest]))
                largest=right;
            exchangeElements(array,largest,i);
        }
    }

    //工具方法，将数组中两个位置的元素交换
    public static void exchangeElements (int [] array ,int index1 ,int index2){
        int tmp ;
        tmp  = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

}
