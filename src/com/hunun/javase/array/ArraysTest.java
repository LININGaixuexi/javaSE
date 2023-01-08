package com.hunun.javase.array;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] a = {4,2,5,8,7};
        Arrays.sort(a);
        for(int i =0; i <a.length; i++){
            System.out.println(a[i]);
        }
    }
}
