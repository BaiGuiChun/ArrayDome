package com.dome.array;

import java.util.Scanner;

public class ArrayDome01 {
    public static void main(String[] args) {
//        元素累加和
        int[] inArray=new int[5];
//        通过键盘输入
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < inArray.length; i++) {
            System.out.println("输入"+(i+1)+"个元素");
            inArray[i]=scanner.nextInt();
        }
        System.out.println("数组内容为：");
        for (int i = 0; i < inArray.length; i++) {
            System.out.println(inArray[i]);
        }

//        使用foreach
        System.out.println("foreach:");
        for (int n:inArray) {
            System.out.println(n);
        }



//        累加和
        int sum=0;
        for (int i = 0; i < inArray.length; i++) {
            sum=sum+inArray[i];
        }
        System.out.println("累加和："+sum);

    }
}
