package internship.org.daythree;

import java.util.Arrays;

public class ChocolateFactory {
    public static void nonZero(int[] arr){
        int index=0;
        int size = arr.length;
        for(int current=0;current<size;current++){
            if(arr[current]!=0){
                arr[index]=arr[current];
                index++;
            }
        }
        while(index<size){
            arr[index]=0;
            index++;
        }
    }
    public static void main(String[] args) {
        int[] packets = {1, 0, 2, 3, 0, 4, 5, 0};
        nonZero(packets);
        System.out.println(Arrays.toString(packets));
    }
}
