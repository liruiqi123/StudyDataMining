package algorithm;

/**
 * Created by Administrator on 2017/6/22.
 */
public class SimpaleArrayInsertSort {
    public static  void  main(String[] args){
        java.util.Random r=new java.util.Random();
        int [] testArray =  new int [50];
        for (int i = 0 ;i<testArray.length;i++){
            testArray[i] = r.nextInt(100);
        }

        System.out.println("******************************");
        for (int i = 0 ;i<testArray.length;i++){
            System.out.print(testArray[i]+",");
        }
        System.out.println(" ");
        System.out.println("******************************");

        testArray = insertSort(testArray);

        System.out.println("******************************");
        for (int i = 0 ;i<testArray.length;i++){
            System.out.print(testArray[i]+",");
        }
        System.out.println(" ");
        System.out.println("******************************");

    }

    public static  int[] insertSort(int[] arrary){

        if (arrary == null || arrary.length < 2) {
            return arrary;
        }


        int length =  arrary.length;
        int i,j;
        for(i = 0;i<length;i++){
            int key = arrary[i];
            j = i-1;
            while(j>=0&&arrary[j]>key){
                arrary[j+1] = arrary[j];
                j--;
            }
            arrary[j+1] =  key ;
        }

        return  arrary;
    }
}
