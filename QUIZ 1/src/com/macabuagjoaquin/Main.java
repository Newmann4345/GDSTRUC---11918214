package com.macabuagjoaquin;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //40pts: Modify the BubbleSort and SelectionSort to sort arrays in descending order
        //60pts: Modify the Selection Sort to look for the smallest value first and put it
        // at the end instead of looking for the largest and putting it in the beginning.

        Scanner pause = new Scanner(System.in);
        int [] numbers = new int [10];

        numbers [0] = 35;
        numbers [1] = 69;
        numbers [2] = 1;
        numbers [3] = 10;
        numbers [4] = -50;
        numbers [5] = 328;
        numbers [6] = 63;
        numbers [7] = 58;
        numbers [8] = 26;
        numbers [9] = 13;

        System.out.println("before sorting:");
        printArrayElements(numbers);
        pause.nextLine();

        System.out.println("\n After selection sorting:");
        selectionSort(numbers);
        printArrayElements(numbers);
        pause.nextLine();

        System.out.println("\n after bubble sorting");
        bubblesSort(numbers);
        printArrayElements(numbers);
    }

    //THE BUBBLE SORT
    private static void bubblesSort(int[] arr)
    {
        Scanner pause = new Scanner(System.in);
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for(int i = 0; i > lastSortedIndex; i++)
            {
                if (arr[i] > arr[i + 1])
                {
                    pause.nextLine();
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    printArrayElements(arr);
                }
            }
        }
    }

    private static void selectionSort(int[] arr)
    {
        Scanner pause = new Scanner(System.in);
        //changed the <
        for(int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int largestIndex = 0;

            for (int i = 0; i <= lastSortedIndex; i++)
            {
                //change
                if (arr[i] < arr[largestIndex])
                {
                    largestIndex = i;
                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[largestIndex];
            arr[largestIndex] = temp;
        }
    }

    //function that prints your array
    private static void printArrayElements(int[] arr)
    {
        for (int j : arr) {
            System.out.print(j + ", ");
        }
    }
}

//Scanner pause = new Scanner(System.in);
//
//while (!deck.isEmpty) {
//....
//    pause.nextLine();
//}