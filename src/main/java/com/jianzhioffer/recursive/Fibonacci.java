package com.jianzhioffer.recursive;

//动态规划，用循环不要用递归

/**
 * F(1)=1
 * F(2)=1
 * F(n)=F(n-1)F(n-2)
 *
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(new Fibonacci().fibonacci(8));
    }

    public int fibonacci(int n) {
        int a=1,b=1,c=0;
        if(n<0){
            return 0;
        }else if(n==1||n==2){
            return 1;
        }else{
            for (int i=3;i<=n;i++){
                c=a+b;
                b=a;
                a=c;
            }
            return c;
        }
    }

    /*public int fibonacci(int n) {
        int result=0;
        if (n>=0 && n<=39){
            if (n==0)result=0;
            if (n==1 || n==2) result=1;
            if (n>2){
                result=new Fibonacci().fibonacci(n-1)+new Fibonacci().fibonacci(n-2);
            }


        }
        return result;
    }*/


}
