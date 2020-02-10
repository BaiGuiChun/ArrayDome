package com.dome.array;

public class ArrayMaxValue {
    public static void main(String[] args) {
        //    求最大值
        int[] a={34,45,67,89,90};
        int max=a[0];

        for (int i = 0; i < a.length; i++) {
//            a[0] a[1] a[2] a[3] a[4]
//             34   45   67   89   90
            if (max<a[i]){
                max=a[i];
            }
        }
    }

    
}
