package com.zhaozishuang;

import java.util.HashSet;
import java.util.Set;

public class Test02 {

    public String is_Contain(int i,int j){
        String result="NO";
        Set<Integer> setData=new HashSet<Integer>();
        if (i==1 && (!setData.contains(j))){
            setData.add(j);
        }else if (i==2){
            if (setData.contains(j)){
                result ="YES";
            }
        }
        return result;
    }
}
