package com.company;

public class BubbleSort {

    public static void main(String[] args) {
        int[] theArray = {4,6,9,1,8,3,2,23,24,54,554,657,68,34,67,867,9,8,5,6,7,3,765,756,56,345,87,34,5645,35,57,867,89,89,4,567,6,45,54,568,867,978,54,758,6,345,23,54,568,70,79,67867,456,54756,435,546756,867,4534,6678789,3543467,578,52,6,0,-1};
        bubbleSort(theArray);
    }

    public static void bubbleSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i ; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr [j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        printArray(arr);

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
