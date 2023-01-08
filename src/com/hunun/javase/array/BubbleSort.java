package com.hunun.javase.array;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {4, 2, 3, 4, 5, 6, 6, 7, 8};
        //冒泡排序第一次排n次
        sortln(a);
        sortln1(a);

    }

    public static void sortln(int[] in) {
        for (int i = in.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (in[j] > in[j + 1]) {
                    int temp;
                    temp = in[j];
                    in[j] = in[j + 1];
                    in[j + 1] = temp;
                }
            }

        }
        for (int i = 0; i < in.length; i++) {
            System.out.println(in[i]);
        }
    }

    public static void sortln1(int[] in) {
        //从左边开始放最小值
        for(int i =0; i<in.length-1; i++){
            int min = i;
            for(int j=i+1;j<in.length;j++){
                if(in[j]<in[min]){
                    min = j;

                }


            }
        }
        for (int i = 0; i < in.length; i++) {
            System.out.println(in[i]);
        }

    }
}

