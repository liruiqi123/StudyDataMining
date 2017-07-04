package GetOffer;

/**
 * Created by liyaoshi on 2017/7/4.
 * 剑指offer 二维数组中的查找
 * 问题描述：一个二维数组，每一行从左到右递增
 *           每一列，从上到下递增
 *           输入一个二维数组和一个整数，判断数组中是否含有整数
 * 代码中的数据为随机生成，未能如题所示，有一定规律，可以在优化中进行更改
 */
public class FindInArrayt {
    public static  boolean find (int [][] array, int number){
        if(null == array)
            return  false;
        int row = 0;
        int column = array[0].length-1;
        while(row<array.length&&column>=0){
            if (number==array[row][column]){
                return true;
            }

            if( number>array[row][column]){
                row++;
            }else if (number<array[row][column]){
                column--;
            }
        }
        return false;
    }

    public static  void main(String[] args){
        java.util.Random r = new java.util.Random();
        int array[][] = new int [5][5];
        for(int i =0;i<5;i++){
            for (int j = 0;j<5;j++)
                array[i][j] = r.nextInt(100);
        }

        for(int i =0;i<5;i++){
            for (int j = 0;j<5;j++){
                System.out.print(array[i][j]+",");
            }
            System.out.println("    ");
        }

        if(find(array,52))
            System.out.println("该矩阵中包含幸运52");
        else
            System.out.println("该矩阵中不包含幸运52");
    }
}
