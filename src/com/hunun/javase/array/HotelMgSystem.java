package com.hunun.javase.array;

import java.util.Scanner;

public class HotelMgSystem {
    public static void main(String[] args) {
        // Hotel ht = new Hotel();
        // ht.print();
        System.out.println("欢迎使用酒店管理系统，请阅读以下使用说明");
        System.out.println("请输入对应的功能编号:[1] 查看房间列表 [2] 订房 [3]退房 [0]表示退出酒店系统");
        Scanner s = new Scanner(System.in);
        while (true) {
            int num = s.nextInt();
            if (num > 3 || num < 0) {
                System.out.println("你输入的编号不符合规则,请重新输入");

            }

            if (num == 0) {
                System.out.println("退出酒店系统");
                return;
            }
            if (num == 1) {
                Hotel ht = new Hotel();
                ht.print();
            }
            if (num == 2) {
                System.out.println("请输入预定的房间号 101-309");
                Scanner s1 = new Scanner(System.in);
                int num1 = s1.nextInt();
                if (num1 < 101 || num1 > 309) {
                    System.out.println("您输入的房间号不符合规则，请重新输入");
                }
                Hotel ht = new Hotel();
                ht.order(num1);
                System.out.println("您的房间预定成功");
            }
            if (num == 3) {
                System.out.println("请输入退房间号 101-309");
                Scanner s2 = new Scanner(System.in);
                int num2 = s2.nextInt();
                if (num2 < 101 || num2 > 309) {
                    System.out.println("您输入的房间号不符合规则，请重新输入");
                }
                Hotel ht = new Hotel();
                ht.exit(num2);
                System.out.println("您的房间已经成功退房");
            }
        }
    }
}
