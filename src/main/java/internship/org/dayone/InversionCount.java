package internship.org.dayone;

import java.util.Arrays;

/*
 * InversionCount is no of pairs in array where left > right
 * Example:
 * 1, 9, 6, 4, 5
 * (9, 6), (9, 4), (9, 5), (6, 4), (6, 5)
 * Count = 5
 * 
 * 9,4,2,13,10,6,12
 * (9,4),(9,2),(9,6),(4,2),(13,10),(13,6),(13,12),(10,6)
 * count = 8
 */

public class InversionCount {
    // O(n2)
    public static int inversionCount(int[] arr){
        int inversions=0;
        for(int current=0;current<arr.length-1;current++){
            for(int adjucent=current+1;adjucent<arr.length;adjucent++){
                if(arr[current]>arr[adjucent]){inversions++;}
            }
        }
        return inversions;
    }

    // O(nlogn)
    public static int mergeAndCount(int[] original, int[] temporary, int start, int middle, int end){
        int inversions = 0;// current recursion count
        System.out.println(Arrays.toString(Arrays.copyOfRange(original, start, end+1)));
        System.out.println("Start "+start+" middle "+middle+" end "+end);
        int westIndex = start, eastIndex = middle + 1, current = start;
        System.out.println("West Index "+westIndex+" East Index "+eastIndex+" current pos "+current);
        while(westIndex<=middle&&eastIndex<=end){
            if(original[westIndex]<=original[eastIndex]){
                temporary[current++] = original[westIndex++];
            }
            else{
                System.out.println(temporary[current]+" "+original[eastIndex]+" pair");
                temporary[current++] = original[eastIndex++];
                inversions += (middle-westIndex+1);
                System.out.println((middle-westIndex+1)+" done");
            }
        }
        // Copy remaining elements of left subarray, if any
        while (westIndex <= middle) {
            temporary[current++] = original[westIndex++];
        }

        // Copy remaining elements of right subarray, if any
        while (eastIndex <= end) {
            temporary[current++] = original[eastIndex++];
        }

        // Copy sorted subarray back to original array
        for (westIndex = start; westIndex <= end; westIndex++) {
            original[westIndex] = temporary[westIndex];
        }
        System.out.println("Current Inversion Count "+inversions);
        return inversions;
    }

    private static int divide(int[] arr, int[] temporary, int left, int right) {
        int inversions = 0;// total count
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, left, right+1)));
        if (left < right) {
            int mid = (left + right) / 2;

            // Count inversions in left subarray
            inversions += divide(arr, temporary, left, mid);

            // Count inversions in right subarray
            inversions += divide(arr, temporary, mid + 1, right);

            // Count split inversions
            inversions += mergeAndCount(arr, temporary, left, mid, right);
        }
        return inversions;
    }


    public static void main(String[] args) {
        // int[] arr = {45,91,10,67,21,6,11};
        int[] arr = {1, 9, 6, 4, 5};
        // int[] arr = {9,4,2,13,10,6,12};
        int[] temporary = new int[arr.length];
        int count = divide(arr, temporary, 0, arr.length-1);
        System.out.println(count);
        //System.out.println(inversionCount(arr));
    }

}
