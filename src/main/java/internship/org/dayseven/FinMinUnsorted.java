package internship.org.dayseven;

import java.util.Arrays;

public class FinMinUnsorted {
    public static int findMinValue(int[] arr){
        int size = arr.length+1;
        int posXor = 0, valueXor = 0;
        for(int index=1;index<=size;index++){
            posXor^=index;
            if(index-1<size-1)
                valueXor ^= arr[index-1];
        }
        return posXor ^ valueXor;
    }
    // unsorted one
    public static int findMinAny(int[] arr){
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for(int index=0;index<arr.length;index++){
            if(arr[index]<firstMin){
                secondMin=firstMin;
                firstMin=arr[index];
            }
            else if(arr[index]<secondMin&&arr[index]!=firstMin){
                secondMin=arr[index];
            }
        }
        int different = secondMin-firstMin;
        int missing = secondMin+1 - different;
        if(missing != secondMin)
            return missing;
        else{
            for(int index=0;index<arr.length;index++){
                if(arr[index]==firstMin||arr[index]==secondMin)
                    arr[index]=Integer.MAX_VALUE;
            }
            return findMinAny(arr);//, firstMin, secondMin);
        }
    }
    public static void main(String[] args) {
        // int[] numbers = {8, 2, 4, 5, 3, 7, 1};
        // int[] numbers = {1, 2, 3, 5};
        // int[] numbers = {1};
        // int[] numbers = {5,10,8,11};
        /*
         * firstMin=5, secondMin=8
         * secondMin-firstMin>> 3
         * secondMin+1 - 3 >> 6
         */
        // if it starts with 1 to N
        //System.out.println(findMinValue(numbers));
        // any number any order
        // int[] numbers = {1000,2500,2550,4000};
        int[] numbers = {98,454,12,86,13,89};
        System.out.println(findMinAny(numbers));
    }
}
