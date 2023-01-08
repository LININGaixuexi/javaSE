package com.hunun.javase.array;

import java.util.Objects;

public class Room {

        private int no;
        private String type;
        private boolean status;
        public int getNo(){
            return no;
        }
        public void setNo(int no){
            this.no = no;
        }

        public String getType() {
            return type;
        }

        public boolean isStatus() {
            return status;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }

        public Room(int no, String type, boolean status) {
            this.no = no;
            this.type = type;
            this.status = status;
        }

        @Override
        public String toString() {
            return "["+no+"]"+ "["+type+"]" + "["+(status?"空闲":"占用")+"]";
        }

        public static void main(String[] args) {
            com.hunun.javase.array.Room room = new com.hunun.javase.array.Room(101,"总统套房",true);
            System.out.println(room.toString());
        }


        public boolean equals(Object o){
            if(this == o){
                return  true;
            }if(o == null|| !(o instanceof com.hunun.javase.array.Room)) {
                return false;}
            com.hunun.javase.array.Room room =(com.hunun.javase.array.Room) o;
            return no == room.no;

        }

        @Override
        public int hashCode() {
            return Objects.hash(no, type, status);
        }
    }

