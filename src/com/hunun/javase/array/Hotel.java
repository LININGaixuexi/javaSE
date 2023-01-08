package com.hunun.javase.array;

import java.util.Objects;

/*
为某个酒店编写程序：酒店管理系统，模拟订房，退房，打印所有房间状态等功能。
1.该系统的用户是：酒店前台。
2.酒店使用一个二维数组来模拟。"Room[][] rooms";
3.酒店中的每一个房间应该是一个java对象：Room
4.每一个房间Room 应该有：房间编号，房间类型，房间是否空闲。
5.系统应该对外提供功能：
  可以预定房间：用户输入房间编号，订房
  可以退房：用户输入房间编号，退房。
  可以查看所有房间的状态：用户输入某个指令应该可以查看所有房间状态。



 */
public class Hotel {
    private Room[][] rooms;

    public Hotel() {
        rooms = new Room[3][10];
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (i == 0) {
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "单人间", true);
                }
                if (i == 1) {
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "双人间", true);
                }
                if (i == 2) {
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "豪华间", true);
                }
            }
        }
    }
    public void print(){
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                Room room = rooms[i][j];
                System.out.println(room);
            }
            }
    }
    public void order(int roomNo){
      Room room = rooms[roomNo/100-1][roomNo % 100-1];
      room.setStatus(false);
    }
    public void exit(int roomNo){
        Room room = rooms[roomNo/100-1][roomNo % 100-1];
        room.setStatus(true);
    }
}



