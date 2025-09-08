package leetcode;

public class twoPointer {

        public static int closestSumLessOrEqual(int[] arr, int target) {
            int closestSum = Integer.MIN_VALUE; // To track closest sum <= target

            for (int start = 0; start < arr.length; start++) {
                int currentSum = 0;
                for (int end = start; end < arr.length; end++) {
                    currentSum += arr[end];

                    if (currentSum <= target && currentSum > closestSum) {
                        closestSum = currentSum;
                    }

                    // If exact target found, return immediately
                    if (closestSum == target) {
                        return closestSum;
                    }
                }
            }

            return closestSum;
        }

        public static void main(String[] args) {
            int[] arr = {2, 3, 7, 4, 10, 5};
            int target = 14;

            int result = closestSumLessOrEqual(arr, target);
            System.out.println("Closest sum to target <= target is: " + result);
            System.out.println(arr);
        }

}
