package com.hunun.javase.array;

import java.util.Arrays;

public class ArrayTwoSearch1 {
    public static void main(String[] args) {
        int[] arr = {1, 8, 9, 10, 12, 13, 15, 19, 6, 4, 3};
        Arrays.sort(arr);
        int index = dichotomy1(arr, 19);
        System.out.println(index == -1 ? "元素未找到" : "元素找到了，下标为" + index);


    }

    private static int dichotomy1(int[] arr, int i) {
        int begin = 0;
        int end = arr.length - 1;
        while (begin<=end) {
            int mid = (begin + end) / 2;
            if (arr[mid] == i) {
                return mid;
            } else if (arr[mid] > i) {
                end = mid - 1;

            } else if (arr[mid] < i) {
                begin = mid + 1;

            }
        }
        return -1;
    }

    }
