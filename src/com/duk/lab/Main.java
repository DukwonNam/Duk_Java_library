/*
 * Copyright @ DukwonNam
 * email: ndukwon@google.com
 */

package com.duk.lab;

import java.util.Arrays;

import com.duk.lab.input.InputGenerator;
import com.duk.lab.sorting.BubbleSort;
import com.duk.lab.sorting.InsertionSort;

/**
 * @author DukwonNam
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!!");
        final InputGenerator generator = new InputGenerator();
        final Comparable[] generatedArray = generator.getInputArray();
        printArray("generatedArray", generatedArray);

        // Insertion sort
        {
            final Comparable[] copiedArrayForInsertionSort = Arrays.copyOf(generatedArray, generatedArray.length);
            printArray("InsertionSort", copiedArrayForInsertionSort);
            final InsertionSort insertionSortUnit = new InsertionSort();

            final long startTime = System.currentTimeMillis();
            insertionSortUnit.sort(copiedArrayForInsertionSort);
            final long endTime = System.currentTimeMillis();

            printArray("InsertionSort", copiedArrayForInsertionSort);
            System.out.println("InsertionSort time: " + (endTime - startTime) + "ms");
        }

        // Bubble sort
        {
            final Comparable[] copiedArrayForBubbleSort = Arrays.copyOf(generatedArray, generatedArray.length);
            printArray("BubbleSort", copiedArrayForBubbleSort);
            final BubbleSort bubbleSortUnit = new BubbleSort();

            final long startTime = System.currentTimeMillis();
            bubbleSortUnit.sort(copiedArrayForBubbleSort);
            final long endTime = System.currentTimeMillis();

            printArray("BubbleSort", copiedArrayForBubbleSort);
            System.out.println("BubbleSort time: " + (endTime - startTime) + "ms");
        }
    }

    private static void printArray(String text, Comparable[] arrayToPrint) {
        System.out.print(text + "(" + arrayToPrint.length + ") [");
        for (Comparable item : arrayToPrint) {
            System.out.print(item + ", ");
        }
        System.out.print("]\n");
    }
}
