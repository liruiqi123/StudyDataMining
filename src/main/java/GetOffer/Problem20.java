package GetOffer;

/**
 * Created by liyaoshi on 2017/7/5.
 * 顺时针打印矩阵
 * 问题描述 输入一个矩阵，按照从外向里顺时针的顺序依次打印出每一个数字
 */


/**
 * 这个不行，得重新写
 */
public class Problem20 {
    public static  void main(String[] args){
        java.util.Random r = new java.util.Random();
        int array[][] = new int [5][5];
        for(int i =0;i<5;i++){
            for (int j = 0;j<5;j++){
                int value = r.nextInt(100);
                array[i][j] = value;
            }

        }

        for(int i =0;i<5;i++){
            for (int j = 0;j<5;j++){
                System.out.print(array[i][j]+",");
            }
            System.out.println("    ");
        }



        System.out.println("    ");
        printUp(array,0,0);
    }





    public static  void printUp(int[][] array ,int row,int column){
        int length = array[0].length;
        int width = column;
        int printLength = length - (width<<1);
        System.out.println(printLength);
        for(int i = 0; i <printLength ;i++){
            System.out.print(row + "," + column+",");
            System.out.println(array[row][column] + ",");
            column++;
        }
        column--;
        printRigt(array,row+1,column);

    }

    public static void printRigt(int[][] array ,int row,int column){
        int length = array.length;
        int width = row;
        int printLength = length - (width<<1);
        for(int i = 0; i <printLength ;i++){
            System.out.print(row + "," + column+",");
            System.out.println(array[row][column] + ",");
            row++;
        }
        row--;
        printDown(array, row, column - 1);
    }

    public  static  void  printDown(int[][] array ,int row,int column){
        int length = array[0].length;
        int width = length + 1 - column ;
        int printLength = length - (width<<1);
        for(int i = 0; i <printLength ;i++){
            System.out.print(array[row][column]+",");
            column--;
        }
        column++;
        printLeft(array, row-1, column);
    }


    public  static  void  printLeft(int[][] array ,int row,int column){
        int length = array.length;
        int width = length + 1 - row ;
        int printLength = length -(width<<1);
        for(int i = 0; i <printLength ;i++){
            System.out.print(array[row][column]+",");
            row--;
        }
    }
}
