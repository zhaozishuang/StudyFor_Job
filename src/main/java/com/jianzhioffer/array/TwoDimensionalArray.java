package com.jianzhioffer.array;

/**
 * 在一个二维数组中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class TwoDimensionalArray {

    public static void main(String[] args) {
        int[][] array={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(new TwoDimensionalArray().Find(99,array));
    }

    public boolean Find(int target, int[][] array) {
        if (array.length<=0 || target<0) return false;
        int y=array.length-1;
        int x=array[0].length-1;
        int i=0;
        int j=y;
        while (i<=x && j>=0){
            if (array[i][j]<target){
                i++;
            }else if (array[i][j]>target){
                j--;
            }else{
                return true;
            }
        }
        return false;
    }



   /* private boolean Find(int target, int[][] array) {
        int row_last=array.length-1;
        int column_last=array[0].length-1;
        int result=0;
        int i=0;
        if ( target>Integer.MAX_VALUE || target<Integer.MIN_VALUE||array.length==0 ||target<array[0][0] || target>array[row_last][column_last]) return false;
        while (row_last>=0 && i<=column_last){
            if (target==array[row_last][i]) {
                result = 1;
                break;
            } else if (target<array[row_last][i]){
                row_last--;
            }else {
                i++;
            }
        }
        return (result==0)?false:true;
    }*/

    //运行超时了
  /*  public boolean Find(int target, int [][] array) {
        int row_last=array.length-1;
        int column_last=array[0].length-1;
        int result=0;
        if (target<array[0][0] || target>array[row_last][column_last]) return false;
        int x=0,y=0;
        while (x<=row_last && y<=column_last){
            if (array[x][column_last] ==target || array[row_last][y]==target) result=1;
            if (x!=row_last && y!=column_last && target>array[x][column_last] && target<array[row_last][y]){ x++; row_last--;}
            if (x!=row_last && y!=column_last && target<array[x][column_last]) {column_last--;}
            if (x!=row_last && y!=column_last && target>array[row_last][y]) {y++;}

        }
        return (result==0)?false:true;

    }*/
}
