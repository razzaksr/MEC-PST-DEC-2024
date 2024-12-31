package internship.org.dayseven;

import java.util.Arrays;

public class NextGreaterInArray {
    public static void nextGreater(int[] arr){
        int size = arr.length;
        int[] greater = new int[size];
        Arrays.fill(greater, -1);
        for(int current = 0;current<size;current++){
            for(int next=current+1;next<size;next++){
                if(arr[current]<arr[next]){
                    greater[current]=arr[next];
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(greater));
    }
    public static void main(String[] args) {
        // int[] arr = {6, 8, 0, 1, 3};
        // int[] arr = {1, 3, 2, 4};
        // int[] arr = {10, 20, 30, 50};
        int[] arr = {50, 40, 30, 10};
        nextGreater(arr);
    }
}
