package com.zzs.string;

import java.util.HashSet;

/**
 *
 LeetCode: 给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
 在构造过程中，请注意区分大小写。比如"Aa"不能当做一个回文字符串。
 注 意:假设字符串的长度不会超过 1010。
 *
 */
public class PhraseString {
    public static void main(String[] args) {
        String s="AabbbCbCA";
        int count=new PhraseString().phraseString(s);
        System.out.println(count);
    }

    private int phraseString(String s) {
        if (s.length()==0){
            return 0;
        }
        int count=0;
        HashSet<Character> hashSet=new HashSet<Character>();
        StringBuilder sb=new StringBuilder();
        char c[]=s.toCharArray();
        for (int i=0;i<c.length;i++){
            if (!hashSet.contains(c[i])){
                hashSet.add(c[i]);
            }else {
                sb.append(c[i]);
                hashSet.remove(c[i]);
                sb.append(c[i]);
                ++count;
            }

        }
        if (!hashSet.isEmpty()){
            sb.append(hashSet.toString().charAt(1));
        }
        System.out.println("最长回文串是： "+ sb.toString());

        return hashSet.isEmpty()?count*2:count*2+1;
    }

}
