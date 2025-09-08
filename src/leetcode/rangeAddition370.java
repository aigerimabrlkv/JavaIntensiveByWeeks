package leetcode;

public class rangeAddition370 {
   //Range Updates with Prefix Sums (1D)
        public int[] getModifiedArray(int length, int[][] updates) {
            // Step 1: Initialize the difference array of size length + 1
            int[] diffArray = new int[length + 1];

            // Step 2: Apply all updates to the difference array
            for (int[] update : updates) {
                int startIndex = update[0];
                int endIndex = update[1];
                int inc = update[2];

                diffArray[startIndex] += inc;

                // If endIndex + 1 is within bounds, mark the end of the update range
                if (endIndex + 1 < length + 1) {
                    diffArray[endIndex + 1] -= inc;
                }
            }

            // Step 3: Compute the final array using a prefix sum of the difference array
            int[] result = new int[length];
            result[0] = diffArray[0];

            for (int i = 1; i < length; i++) {
                result[i] = result[i - 1] + diffArray[i];
            }

            return result;
        }
    }

