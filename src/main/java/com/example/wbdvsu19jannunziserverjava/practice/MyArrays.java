package com.example.wbdvsu19jannunziserverjava.practice;

public class MyArrays {
    public static void main(String[] args) {

        arraysArePassedByReference();

        cloningArrays();

        printIntArrayForEach(new int[]{1, 2, 3}, "For Each");

        anonymousArray();

        createLiteralArraysWithOutNew();

        createLiteralArraysWithNew();

        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        printIntArray(array, "Print Array");

        createArrayWithNew();

        System.out.println("\nHello World!");
    }

    public static void arraysArePassedByReference() {
        int[] array = {1, 2, 3};
        printIntArrayForEach(array, "Original Array Before Update");
        updateArrayAtIndex(array, 2, 33);
        printIntArrayForEach(array, "Original Array After Update");
    }

    public static void updateArrayAtIndex(int[] array, int index, int newValue) {
        array[index] = newValue;
    }

    public static void cloningArrays() {
        int[] array = {1, 2, 3};
        int[] clonedArray = array.clone();
        printIntArrayForEach(array, "Original Array");
        printIntArrayForEach(clonedArray, "Cloned Array");
        clonedArray[1] = 22;
        printIntArrayForEach(array, "Original Array After Mutation");
        printIntArrayForEach(clonedArray, "Cloned Array After Mutation");
    }

    public static void anonymousArray() {
        printIntArray(new int[]{1, 2, 3}, "Anonymous Array");
    }

    public static void createLiteralArraysWithOutNew() {
        int[] array = {1, 2, 3};
        printIntArray(array, "Create Literal Array Without New");
    }

    public static void createLiteralArraysWithNew() {
        int[] array = new int[]{1, 2, 3};
        printIntArray(array, "Create Literal Array With New");
    }

    public static void printIntArrayForEach(int[] array, String message) {
        System.out.println("\n" + message);
        for (int element : array) {
            System.out.println(element);
        }
    }

    public static void printIntArray(int[] array, String message) {
        System.out.println("\n" + message);
        for(int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void createArrayWithNew() {
        System.out.println("\nCreate Array With New");
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        for(int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
