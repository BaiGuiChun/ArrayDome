package com.dome.array;

public class ArrayDome {
    public static void main(String[] args) {
//        声明数组
        int[] inArray;
        String strArray[];

//        创建数组
        inArray=new int[5];
        strArray=new String[10];

//        声明同时创建数组
        float[] flArray[] = new float[4][];

        System.out.println(inArray[2]);
        System.out.println(strArray[5]);
        System.out.println("......");

//        int数组
        for (int i = 0; i < 5; i++) {
//            inArray[0]=1;
            inArray[i]=i+1;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(inArray[i]);
        }
    }
}
