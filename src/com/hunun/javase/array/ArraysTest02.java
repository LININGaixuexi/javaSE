package com.hunun.javase.array;

import java.util.Arrays;

public class ArraysTest02 {
    public static void main(String[] args) {
        int[] a = {1,1,5,17,8,9,10};
        Arrays.sort(a);
       int index =  Arrays.binarySearch(a,60);
        System.out.println(index <= 0 ? "元素未找到" : "元素找到了，下标为" + index);

    }
}
