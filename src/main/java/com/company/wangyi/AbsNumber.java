package com.company.wangyi;

import java.util.Arrays;

/**
 * 例如,为了得到1325的"相反数",首先我们将该数的数字顺序颠倒,我们得到5231,
 * 之后再加上原先的数,我们得到5231+1325=6556.
 * 如果颠倒之后的数字有前缀零,前缀零将会被忽略。例如n = 100, 颠倒之后是1.
 *
 * 输入包括一个整数n,(1 ≤ n ≤ 10^5)
 * 输出一个整数,表示n的相反数
 * 1325
 * 6556
 */
public class AbsNumber {
    public static void main(String[] args) {
        System.out.println(new AbsNumber().abs_numbers(100));
    }

    public int abs_numbers(int number){
        int sum=0;
        int tmp=number%10;
        int tag=number/10;
        int i=1;
        if (number>=1 && number<=Math.pow(10,5)){
            while (tag>0){
                sum=sum*10+tmp;
                tag=number / (int)(Math.pow(10,i));
                ++i;
                 tmp=(number% (int)(Math.pow(10,i))) / (int)(Math.pow(10,i-1));

            }


        }else {
            return 0;
        }

        return sum+number;
    }
}
