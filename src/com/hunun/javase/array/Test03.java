package com.hunun.javase.array;

import java.util.Scanner;

class Test03
{
    public static void main(String[] args){
        int[][] twoDimensional ={{1,2},{3,4}};
        for(int i=0; i<twoDimensional.length;i++){
            for(int j=0; j<twoDimensional[i].length;j++){
                System.out.println(twoDimensional[i][j]);
            }

        }
        for(int i=0;i<twoDimensional.length;i++){
            System.out.println(twoDimensional[i][1]);
        }

        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        for(int i=0;i<twoDimensional.length;i++){
            System.out.println(twoDimensional[number][i]);
        }

    }
}