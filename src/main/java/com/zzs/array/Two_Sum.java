package com.zzs.array;

import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum {
    public static void main(String[] args) {
        int[] arr01={1,4,3,7,5};
        int[] arr02={8,4,3,2};
        int[] arr03={};

        int arr[]= new Two_Sum().twoSum(arr01,9);
       for (int i:arr){
           System.out.println(i);
       }



    }

    private int[] twoSum(int[] arr, int target) {
        int[] result=new int[2];
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        for (int i=0;i<arr.length;i++){
            if (map.containsKey(arr[i])){
                result[1]=i;
                result[0]=map.get(arr[i]);
                return result;
            }
            map.put(target-arr[i],i);
        }
        return result;
    }

    //自己写的

  /*  private int[] twoSum(int[] arr, int target) {
        int[] result=new int[2];
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while (i<j){
            if (arr[i]+arr[j]>target) j--;
            if (arr[i]+arr[j]<target) i++;
            if (arr[i]+arr[j]==target){
                result[0]=i;
                result[1]=j;
            }
        }
        return result;

    }*/

/*    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];

        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (target==nums[i]+nums[j]){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return (result[0]==result[1]?null:result);

    }*/


}
