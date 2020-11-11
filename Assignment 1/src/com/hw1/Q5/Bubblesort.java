package com.hw1.Q5;

public class Bubblesort {

    public static void main(int[] arr)
    {
        int i, j , swap;
        for(i = 0; i < arr.length; i ++)
        {
            for(j = 0; j < arr.length - 1  ;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    swap = arr[j];        // bigger number
                    arr[j] = arr[j+1];    // smaller number
                    arr[j+1] = swap;
                }
            }
        }
    }
}