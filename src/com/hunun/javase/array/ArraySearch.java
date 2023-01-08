package com.hunun.javase.array;

public class ArraySearch {
    public static void main(String[] args) {
        int[] a = {1, 4, 8, 97, 60};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 84) {
                System.out.println("查找到的元素为" + i);
                return;
            }

        }
        System.out.println("没有找到该元素！");

        int index = arrayserch(a, 97);
        System.out.println(index==-1 ?"该元素没找到":"该元素找到了"+index);


    }

    private static int arrayserch(int[] a, int b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                System.out.println("查找到的元素为" + i);
                return i;
            }

        }
        return -1;
    }
}
