package internship.org.dayfive;

import java.util.Arrays;

public class DistnictDigits {
    public static void main(String[] args) {
        int[] nums1 = {131, 11, 48};
        int[] nums2 = {111, 222, 333, 4444, 666};

        System.out.println("Distinct digits in nums1 "+Arrays.toString(nums1)+": ");
        findDistinctDigits(nums1);

        System.out.println("Distinct digits in nums2 "+Arrays.toString(nums2)+": ");
        findDistinctDigits(nums2);
    }

    public static void findDistinctDigits(int[] nums) {
        boolean[] digitsPresent = new boolean[10]; // Array to keep track of digits 0-9
        //System.out.println(Arrays.toString(digitsPresent));
        // iterate every value of int[] array
        for (int num : nums) {
            // find digits
            while (num > 0) {
                int digit = num % 10; // Extract the last digit
                digitsPresent[digit] = true; // Mark the digit as present
                num /= 10; // Remove the last digit
            }
        }
        //System.out.println(Arrays.toString(digitsPresent));

    //     // Print all digits that are present
        for (int i = 0; i < 10; i++) {
            if (digitsPresent[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // New line after printing all digits
    }

}
