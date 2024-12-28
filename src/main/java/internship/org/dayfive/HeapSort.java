package internship.org.dayfive;

import java.util.Arrays;

public class HeapSort {
    public static void heapify(double[] arr,int length, int parent){
        int maximum=parent;
        int left=parent*2+1;
        int right=parent*2+2;
        if(left<length&&arr[left]>arr[maximum]){
            maximum=left;
        }
        if(right<length&&arr[right]>arr[maximum]){
            maximum=right;
        }
        if(maximum!=parent){
            double third=arr[maximum];
            arr[maximum]=arr[parent];
            arr[parent]=third;
            heapify(arr,length,maximum);
        }
    }
    public static void sortHeap(double[] arr){
        for(int index=arr.length/2-1;index>=0;index--){
            heapify(arr, arr.length, index);
        }
        for(int position=arr.length-1; position>=0;position-- ){
            double third=arr[0];
            arr[0]=arr[position];
            arr[position]=third;
            heapify(arr,position,0);
        }
    }
    public static void main(String[] args) {
        double[] myData={3.4,9.2,1.12,12.09,4.5,7.2};
        sortHeap(myData);
        System.out.println(Arrays.toString(myData));
    }

}
