package com.devdutt.array.kadane;

import java.util.Arrays;

public class Program_01_MaximumSubArraySum {

    //Approach: 01 (This is not good for all the negative elements present in the array)
    private static int calculateLongestSubString(int[] input) {
        int curSum = 0, maxSum = 0;
        for (int i = 0; i < input.length; i++) {
            curSum += input[i];
            if (curSum > maxSum) {
                maxSum = curSum;
            }
            if (curSum < 0) {
                curSum = 0;
            }
        }//for
        return maxSum;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, -1, -2, 4, 6, 8, 9, -1, 3, 2};
        System.out.println("Input :- " + Arrays.toString(input));
        int result = calculateLongestSubString(input);
        System.out.println(result);
    }
}
