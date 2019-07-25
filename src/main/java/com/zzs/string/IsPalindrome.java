package com.zzs.string;

import java.util.HashSet;

/**
 * 验证回文串
 *
 * LeetCode: 给定一个字符串，验证它是否是回文串，
 * 只考虑字母和数字字符，可以忽略字母的大小写。
 * 说明：本题中，我们将空字符串定义为有效的回文串
 */
public class IsPalindrome {
    public static void main(String[] args) {
        String s01="AabBCcD";
        String s02="";
        String s03="AacccBCcD";
        System.out.println(new IsPalindrome().isPalindrome(s01));
        System.out.println(new IsPalindrome().isPalindrome(s02));
        System.out.println(new IsPalindrome().isPalindrome(s03));

        String s04="A man, a plan, a canal: Panama";
        System.out.println(new IsPalindrome().isPalindrome(s04));

        String s05="race a car";
        System.out.println(new IsPalindrome().isPalindrome(s05));


    }

    //别人写的
    public  boolean isPalindrome(String s) {
        if (s.length() == 0)
            return true;
        int l = 0, r = s.length() - 1;
        while (l < r) {
            // 从头和尾开始向中间遍历  如果是回文的话从头和尾遍历的值是相等的
            if (!Character.isLetterOrDigit(s.charAt(l))) {// 字符不是字母和数字的情况
                l++;
            } else if (!Character.isLetterOrDigit(s.charAt(r))) {// 字符不是字母和数字的情况
                r--;
            } else {
                // 判断二者是否相等
                if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
                    return false;
                l++;
                r--;
            }
        }
        return true;
    }

    //自己写的
  /*  public boolean isPalindrome(String s){
        if (s.length()==0){
            return true;
        }
        HashSet<Character> hashSet=new HashSet<Character>();
        char[] arr=s.toLowerCase().toCharArray();
        int count=0;

        for (int i=0;i<arr.length;i++){
            if (Character.isLetterOrDigit(arr[i])){
                if (!hashSet.contains(arr[i]) ){
                    hashSet.add(arr[i]);
                    ++count;
                }else {
                    hashSet.remove(arr[i]);
                    --count;
                }
            }

        }
        return (count>1)?false:true;

    }*/

}
