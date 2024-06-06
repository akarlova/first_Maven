package org.example.tasks;

import java.util.ArrayList;

public class Solution {

    public static int numJewelsInStones(String jewels, String stones) {

        int count = 0;
        char[] seperate_jewels = jewels.toCharArray();
        char[] seperate_stones = stones.toCharArray();

        for (char seperateJewel : seperate_jewels) {
            for (char seperateStone : seperate_stones) {
                if (seperateJewel == seperateStone) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int maxNumberOfBalloons(String text) {

        char[] text_chars = text.toCharArray();

        int sumA = 0;
        int sumB = 0;
        int sumL = 0;
        int sumO = 0;
        int sumN = 0;

        for (char textChar : text_chars) {
            if (textChar == 'a') {
                sumA++;
            } else if (textChar == 'b') {
                sumB++;
            } else if (textChar == 'l') {
                sumL++;
            } else if (textChar == 'o') {
                sumO++;
            } else if (textChar == 'n') {
                sumN++;
            }
        }
        return Math.min(sumA, Math.min(sumB, Math.min(sumN, Math.min(sumO / 2, sumL / 2))));
    }
}
