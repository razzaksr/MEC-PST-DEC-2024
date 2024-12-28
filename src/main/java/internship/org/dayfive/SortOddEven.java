package internship.org.dayfive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortOddEven {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5, 4, 7, 10};
        sortOddEven(arr1);
        System.out.println("Output: " + java.util.Arrays.toString(arr1));

        int[] arr2 = {0, 4, 5, 3, 7, 2, 1};
        sortOddEven(arr2);
        System.out.println("Output: " + java.util.Arrays.toString(arr2));
    }

    public static void sortOddEven(int[] arr) {
        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();

        // Separate odd and even numbers
        for (int num : arr) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            } else {
                oddNumbers.add(num);
            }
        }

        // Sort odd numbers in descending order
        Collections.sort(oddNumbers, Collections.reverseOrder());

        // Sort even numbers in ascending order
        Collections.sort(evenNumbers);
        // update into original
        int index = 0;
        for (int num : oddNumbers) 
        {arr[index++] = num;}
        for (int num : evenNumbers) 
        {arr[index++] = num;}
    }
}
