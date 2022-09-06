package com.gradle.comp2522;

public class LabOne {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(convert(i));
        }
    }

    public static String convert(int labOne) {
        if (labOne % 15 == 0) {
            return "labOne";
        }
        if (labOne % 3 == 0) {
            return "LAB";
        }
        if (labOne % 5 == 0) {
            return "ONE";
        }
        return String.valueOf(labOne);
    }
}