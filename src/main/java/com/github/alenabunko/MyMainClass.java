package com.github.alenabunko;

import com.github.alenabunko.arrays.ArrayClassification;
public class MyMainClass {
    public static void main(String[] args) {

        System.out.println("Solving the task \"ArraysClassification\"");

        System.out.println("{12, 0, 45, 101, 7, 11}-------" + ArrayClassification.classification(new int[]{12, 0, 45, 101, 7, 11}));

        System.out.println("{11, 12, 13}-------" + ArrayClassification.classification(new int[]{11, 12, 13}));

        System.out.println("{}-------" + ArrayClassification.classification(new int[]{}));

        System.out.println("{21, 18, 17, 10, 4}-----------" + ArrayClassification.classification(new int[]{21, 18, 17, 10, 4}));

        System.out.println("{1, 1, 1, 1, 1}-------------" + ArrayClassification.classification(new int[]{1, 1, 1, 1, 1}));

        System.out.println("{1, 1, 17, 1, 1}---------" + ArrayClassification.classification(new int[]{1, 1, 17, 1, 1}));

        System.out.println("{1, 1, 20, 300}----" + ArrayClassification.classification(new int[]{1, 1, 20, 300}));
    }
}
