package internship.org.daytwo;

public class MaxSubSum {
    public static void findMaxSumSubArray(int[] arr){
        int maxSum=Integer.MIN_VALUE, subSum=0;
        for(int current=0;current<arr.length;current++){
            subSum=0;
            for(int sub=current;sub<arr.length;sub++){
                subSum+=arr[sub];
                //System.out.println(arr[sub]+" "+subSum);
                if(subSum>maxSum){
                    maxSum=subSum;
                }
            }
        }
        System.out.println(maxSum);
    }
    // Function to find the maximum subarray sum using divide and conquer
    public static int maxSubArraySum(int[] arr, int start, int end) {
        // Base case: If there's only one element
        if (start == end) {
            return arr[start];
        }
        // Find the middle point
        int mid = (start + end) / 2;
        // Recursively find the maximum subarray sum in the left and right halves
        int leftMax = maxSubArraySum(arr, start, mid);
        int rightMax = maxSubArraySum(arr, mid + 1, end);
        // Find the maximum subarray sum crossing the middle
        int crossMax = maxCrossingSum(arr, start, mid, end);
        // Return the maximum of the three values
        return Math.max(Math.max(leftMax, rightMax), crossMax);
    }

    // Helper function to find the maximum subarray sum crossing the middle
    private static int maxCrossingSum(int[] arr, int start, int mid, int end) {
        int leftSum = Integer.MIN_VALUE;
        int sum = 0;
        // Find the maximum sum in the left subarray
        for (int index = mid; index >= start; index--) {
            sum += arr[index];
            if (sum > leftSum) {
                leftSum = sum;
            }
        }
        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        // Find the maximum sum in the right subarray
        for (int index = mid + 1; index <= end; index++) {
            sum += arr[index];
            if (sum > rightSum) {
                rightSum = sum;
            }
        }
        // Return the sum of the maximum sums from the left and right
        return leftSum + rightSum;
    }

    public static void main(String[] args) {
        // int[] nums = {45,91,10,67,21,6,11};
        // findMaxSumSubArray(arr);
        // int[] nums = { 2, -4, 1, 9, -6, 7, -3 };
        int[] nums = {-2,1,3,-3,4,-1,2,1,-5,4};
        // int[] nums ={1, 9, 6, 4, 5};
        findMaxSumSubArray(nums);
        int max = maxSubArraySum(nums, 0, nums.length-1);
        System.out.println(max);
    }

}
