package com.devdutt.array.kadane;

import java.util.Arrays;

public class Program_02_MaximumSubArraySum {

    //Approach: 02
    private static int calculateLongestSubString(int[] input) {
        int curSum = 0, maxSum = input[0];
        for (int i = 0; i < input.length; i++) {
            curSum = curSum + input[i];
            if (curSum > maxSum) {
                maxSum = curSum;
            }
            if (curSum < 0) {
                curSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, -1, -2, 4, 6, 8, 9, -1, 3, 2};
        System.out.println("Input :- " + Arrays.toString(input));
        int result = calculateLongestSubString(input);
        System.out.println(result);
    }
}
