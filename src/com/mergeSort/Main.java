package com.mergeSort;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {4, 5, 6, 2, 90, 565, 3432, 675, 1, 0, 0, 10, 9, 8, 7, 5, 432, 3};
        MergeSort mergeSort = new MergeSort();

        mergeSort.execute(array);

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}