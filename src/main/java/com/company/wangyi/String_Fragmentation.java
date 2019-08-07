package com.company.wangyi;

/**
 * 输入包括一个字符串s,字符串s的长度length(1 ≤ length ≤ 50),s只含小写字母('a'-'z')
 *
 * 输出一个整数,表示所有碎片的平均长度,四舍五入保留两位小数。
 *
 * 如样例所示: s = "aaabbaaac"
 * 所有碎片的平均长度 = (3 + 2 + 3 + 1) / 4 = 2.25
 */
public class String_Fragmentation {
    public static void main(String[] args) {
        String s="aaabbaaac";
        System.out.println(new String_Fragmentation().string_fragment(s));
    }

    public double string_fragment(String s){
        char[] arr=s.toCharArray();
        int len=s.length();
        int count=1;
        int i=0,j=1;
        while (j<arr.length){
            if (arr[j]==arr[i]) j++;
            else {
                ++count;
                i=j;
                ++j;
            }
        }

        return len/(count*0.01*100);

    }
}
