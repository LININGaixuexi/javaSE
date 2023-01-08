package com.hunun.javase.array;

public class MyStcak {

    private Object[] elements;

    private int index = -1;


    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public MyStcak() {
        this.elements = new Object[10];


    }

    public void push(Object obj) {
        if (this.index >= elements.length - 1) {
            System.out.println("栈已满！");
            return;
        }
        this.index++;
        this.elements[index] = obj;
        System.out.println("压栈" + obj + "元素成功，栈帧指向" + index);
    }


    public Object pop() {
        if (index < 0) {
            System.out.println("栈已空");
            return null;
        } else{
            System.out.println(elements[index] + "栈帧指向" + --index);
            System.out.println(index);
            if(  index < 0) {
                System.out.println("栈已空");
                return null;}
            return elements[index];
        }
    }
}






