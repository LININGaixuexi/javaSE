package com.hunun.javase.array;

import java.util.Arrays;

public class ArrayTwoSearch {
    public static void main(String[] args) {
        int[] a =  {1,8,9,10,12,13,15,19,6,4,3};
        Arrays.sort(a);
        for(int i =0; i <a.length; i++){
            System.out.println(a[i]);
        }
        dichotomy(a,1);
        dichotomy(a,19);
        dichotomy(a,20);
    }
    public static void dichotomy(int[] in,int no){
        int b = in.length/2;
        while(b<in.length&&b>=0) {
            if (in[b] < no) {
                System.out.println("小于查找一次，下标为：" +b);
                b=(in.length-b)/2 +b;
            } if (in[b] >no) {
                System.out.println("大于查找一个，下标为：" +b);
                b=b/2;
            }if (in[b]==no){
                System.out.println("已找到，下标为：" +b);
                return ;
            }

        }return;



    }




}
