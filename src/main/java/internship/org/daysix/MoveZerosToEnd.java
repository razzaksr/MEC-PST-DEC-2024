package internship.org.daysix;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void zeros(int[] arr){
        int index, valid;
        for(index=0, valid=0;index<arr.length;index++){
            if(arr[index]!=0){
                arr[valid]=arr[index];
                valid++;
            }
        }
        Arrays.fill(arr, valid,arr.length,0);
    }
    public static void main(String[] args) {
        // int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        // int[] arr = {10, 20, 30};
        int[] arr = {0, 0};
        zeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
