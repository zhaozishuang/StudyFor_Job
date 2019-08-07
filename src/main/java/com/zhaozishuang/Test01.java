package com.zhaozishuang;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Test01 {
    public static void main(String[] args) {
        // 7951346523609888
        //6998915114363550
        long a=7951346523609888L;
        long b=6998915114363550L;
        System.out.println(new Test01().max_gcd(a,b));
    }

    public long max_gcd(long a,long b){
        if (a<1 || a>Math.pow(10,Math.pow(10,5)) || b<1 || b>Math.pow(10,18)){
            return 0;
        }
        long gcd=0;
        if (a<b){
            long tmp;
            tmp=b;
            b=a;
            a=tmp;
        }
        if (a%b==0){
            gcd=b;
        }
        while (a%b>0){
            a=a%b;
            if (a<b){
                long tmp;
                tmp=b;
                b=a;
                a=tmp;
            }
            if (a%b==0){
                gcd=b;
            }
        }

        return gcd;
    }
}
