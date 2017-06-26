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

        //构建最大堆，简化处理可将其移入for循环中
        //注意此处，第二个参数是要处理数组的长度，
        //根据他要经错处理-1才可得到对应元素的下标
        buildMaxHeap(array,array.length);


        //此处for循环，每次将排好序的最大元素放在当前处理数组的末尾
        //注意，没处理一次，待排序的数组长度就少一个
        for(int i = array.length-1 ; i >0 ;i--){
            //将排好序的数组，最大元素与末尾元素交换位置，
            // 生成新的待排序数组，再进行处理
            exchangeElements(array,i,0);
            buildMaxHeap(array,i);
        }

        //打印排序好后的结果
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
        int len = (length>>1)-1;
        for(int i = len ; i >=0 ; i--){
            int left = i<<1;
            int right = left + 1;
            int largest = i;
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
