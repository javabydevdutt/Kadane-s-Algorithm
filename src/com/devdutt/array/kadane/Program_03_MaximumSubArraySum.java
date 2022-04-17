package com.devdutt.array.kadane;

import java.util.Arrays;

public class Program_03_MaximumSubArraySum {

    //Approach: 03
    private static int calculateMaxSumSubArray(int[] arr) {
        int cursum = arr[0];
        int maxsum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (cursum >= 0) {
                cursum = cursum + arr[i];
            } else {
                cursum = arr[i];
            }//else
            if (cursum > maxsum) {
                maxsum = cursum;
            }//if
        }//for
        return maxsum;
    }//method

    public static void main(String[] args) {
        int[] inputs1 = {4, 3, -2, 6, -14, 7, -1, 4, 5, 7, -10, 2, 9, -10, -5, -9, 6, 1};
        int[] inputs2 = {4, 3, -2, 6, 7, -10, -10, 4, 5, 9, -3, 4, 7, -28, 2, 9, 3, -2, 11};
        int[] inputs3 = {-2, -3, -1, -11, -16, -7, -9, -3};
        System.out.println("Input :01- " + Arrays.toString(inputs1));
        System.out.println("MaxSum SubArray :- " + calculateMaxSumSubArray(inputs1));
        System.out.println("=====================================================================");
        System.out.println("Input :01- " + Arrays.toString(inputs2));
        System.out.println("MaxSum SubArray :- " + calculateMaxSumSubArray(inputs2));
        System.out.println("=====================================================================");
        System.out.println("Input :01- " + Arrays.toString(inputs3));
        System.out.println("MaxSum SubArray :- " + calculateMaxSumSubArray(inputs3));
    }
}
