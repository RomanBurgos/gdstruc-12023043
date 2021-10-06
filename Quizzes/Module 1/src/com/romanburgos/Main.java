package com.romanburgos;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[10];

        numbers[0] = 50;
        numbers[1] = 5;
        numbers[2] = 22;
        numbers[3] = 69;
        numbers[4] = 10;
        numbers[5] = 72;
        numbers[6] = 100;
        numbers[7] = 10;
        numbers[8] = 120;
        numbers[9] = 39;

        //print arrays
        System.out.println("Numbers Arrays: ");
        printArrays(numbers);

        //selection sort
        System.out.println("\n\nSelection Sorted");
        selectionSort(numbers);
        printArrays(numbers);

        //bubble sort
        //System.out.println("\n\nBubble Sorted");
        //bubbleSort(numbers);
        //printArrays(numbers);


    }

    private static void bubbleSort(int[] arr)
    {
        for (int lastIndexSorted = arr.length - 1; lastIndexSorted > 0; lastIndexSorted--)
        {
            //find largest
            for (int i = 0; i < lastIndexSorted; i++)
            {
                //sort swap
                if (arr[i] < arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    private static void selectionSort(int[] arr)
    {
        for (int lastIndexSorted = arr.length - 1; lastIndexSorted > 0; lastIndexSorted--)
        {
            int largestIndex = 0;

            for (int i = 1; i <= lastIndexSorted; i++)
            {
                if (arr[i] > arr[largestIndex])
                {
                    largestIndex = i;
                }
            }

            int swap = lastIndexSorted;
            arr[lastIndexSorted] = arr[largestIndex];
            arr[largestIndex] = swap;
        }
    }

    private static void printArrays(int[] arr)
    {
        for (int j : arr)
        {
            System.out.print(j + " ");
        }
    }
}
