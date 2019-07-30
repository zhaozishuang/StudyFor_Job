package com.zzs.string;

/**
 * 剑指offer: 将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，
 * 但是string不符合数字要求时返回0)，
 * 要求不能使用字符串转换整数的库函数。
 * 数值为0或者字符串不是一个合法的数值则返回0
 *
 */
public class String_To_Int {
    public static void main(String[] args) {
        String s01="123456";
        String s02="-1234";
        String s03="+1234";
        String s04=" ";

        System.out.println(Integer.parseInt(s01));
        System.out.println(Integer.valueOf(s02));

        System.out.println("==================================");
        System.out.println(new String_To_Int().string_To_Int(s01));
        System.out.println(new String_To_Int().string_To_Int(s02));
        System.out.println(new String_To_Int().string_To_Int(s03));
        System.out.println(new String_To_Int().string_To_Int(s04));



    }

    private int string_To_Int(String str) {
        if (str.length()==0) return 0;

        char[] arr=str.toCharArray();
        int sum=0;
        int tag=0;
        int start;
        if (arr[0]=='+') tag=1;
        if (arr[0]=='-') tag=2;
        start=(tag>0)?1:0;

        for (int i=start;i<arr.length;i++){
            if (Character.isDigit(arr[i])){
                int tmp=arr[i]-'0';
                sum=sum*10+tmp;
            }else {
                return 0;
            }
        }

        return (tag!=2)?sum:-sum;
    }


}
