package com.zzs.string;

import java.util.Arrays;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 */
public class LongestPrefix {
    public static void main(String[] args) {
        String [] arr={"flower","flow","flight"};
        String [] arr02={"dog","racecar","car"};

       /* String result=new LongestPrefix().longestPrefix(arr);
        System.out.println(result);*/

        String result02=new LongestPrefix().longestPrefix(arr02);
        System.out.println(result02);


    }

    public  String longestPrefix(String[] arr){
        Arrays.sort(arr);
        StringBuilder sb=new StringBuilder();
        int len=Math.min(arr[0].length(),arr[arr.length-1].length());
        for (int i=0;i<=len;i++){
            if (arr[0].charAt(i) != arr[arr.length-1].charAt(i)){
                break;
            }else {
                 sb.append(arr[0].charAt(i));
            }
        }
        return sb.toString();
    }
}
