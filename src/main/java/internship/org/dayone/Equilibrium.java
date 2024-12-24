package internship.org.dayone;

import java.util.Arrays;

/*
 * Equilibrium index where the sum of its left values equals to sum of its right values
 * example: 
 * -7, 1, 5, 2, -4, 3, 0
 * 
 * -7,1,5>> Sum = -1
 * -4,3,0>> Sum = -1
 * 
 * So, equilibriumIndex is 3
 */

public class Equilibrium {
    public static int equilibriumIndex(int[] arr){
        int size = arr.length;
        int totalSum = Arrays.stream(arr).sum();
        int leftSum = 0;
        // System.out.println(totalSum);
        for(int index=0;index<size;index++){
            totalSum-=arr[index];
            if(totalSum==leftSum)
                return index;
            leftSum+=arr[index];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(equilibriumIndex(arr));
    }

}
