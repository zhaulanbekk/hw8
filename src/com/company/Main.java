package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] name = new int[]{10, 8, 3, 3, 4, 4, 9, 12};
        System.out.println(Arrays.toString(name));
        getMin(name);
        getMax(name);
    }

    static void getMin(int[] min) {
        int san = min[0]; // san=1
        for (int i = 0; i < min.length; i++) {
            if (san > min[i])
                san = min[i];
        }
        System.out.println(san + ": is minimum");

    }

    static void getMax(int[] max) {
        int num = max[0];
        for (int i = 0; i < max.length; i++) {
            if (num < max[i])
                num = max[i];
        }
        System.out.println(num + ": is maximum");


    }
}
