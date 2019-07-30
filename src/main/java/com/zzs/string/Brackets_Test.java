package com.zzs.string;

import java.util.Stack;

/**
 * 输入描述:
 * 输入包括一个合法的括号序列s,s长度length(2 ≤ length ≤ 50),序列中只包含'('和')'。
 *
 * 输出描述:
 * 输出一个正整数,即这个序列的深度。
 *
 * 输入:
 * (())
 * 输出:
 * 2
 *
 */
public class Brackets_Test {
    public static void main(String[] args) {

        String s01="()()()";
        String s02="(()(())(()))";
        String s03="(()()())";
        System.out.println(new Brackets_Test().brackets_count(s01));
        System.out.println(new Brackets_Test().brackets_count(s02));
        System.out.println(new Brackets_Test().brackets_count(s03));


    }

    private int brackets_count(String s) {
        int max=0,count=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='('){
                count++;
            }
            if (s.charAt(i)==')'){
                count--;
            }
            max=Math.max(max,count);
        }
        return max;
    }

    //但是，请注意，这道题要求括号的深度。。。深度深度深度！！！


/*
    //自己使用栈实现的括号匹配,求出合法括号有多少个。
    public int brackets_count(String s){
        char[] arr=s.toCharArray();
        int count=0;
        Stack stack=new Stack();

        for (int i=0;i<arr.length;i++){
            if (arr[i]=='('){
                stack.push(arr[i]);
            }
            if (arr[i]==')'){
                stack.pop();
                ++count;
            }

        }
        if (!(stack.empty())){
            return 0;
        }
        return count;
    }*/


}
