package com.zzs.string;

/**
 * 请实现一个函数，
 * 将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.
 * 则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Replace_Space {

    public static void main(String[] args) {
        StringBuilder s=new StringBuilder();
        s.append(" I Love U ");

        String result01=replaceSpaceMethod01(s);
        System.out.println(result01);

        String result02=replaceSpaceMethod02(s);
        System.out.println(result02);

    }

    // 方法一：使用API
    public static String replaceSpaceMethod01(StringBuilder stringBuilder){
        return stringBuilder.toString().replaceAll("\\s","%20");
    }

    //方法二：
    public static String replaceSpaceMethod02(StringBuilder stringBuilder){
        StringBuilder sb2=new StringBuilder();
        int length=stringBuilder.length();
        for (int i=0;i<length;i++){
            char c=stringBuilder.charAt(i);
            if (String.valueOf(c).equals(" ")){
                sb2.append("%20");
            }else {
                sb2.append(stringBuilder.charAt(i));
            }
        }
        return sb2.toString();
    }
}
