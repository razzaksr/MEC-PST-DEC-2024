package internship.org.dayfour;

import java.util.Arrays;

public class Quick {
    public static int getPivotalPoint(int[] arr, int start, int end){
        int initial=start-1;
        int pivotalData=arr[end];
        for(int current=start;current<end;current++){
            if(arr[current]<pivotalData){
                initial++;
                int temp=arr[initial];
                arr[initial]=arr[current];
                arr[current]=temp;
            }
        }
        int temp=arr[initial+1];
        arr[initial+1]=arr[end];
        arr[end]=temp;
        System.out.println(Arrays.toString(arr));
        return initial+1;
    }

    public static void sort(int[] arr, int start, int end){
        if(start<end){
            int pivotalPoint=getPivotalPoint(arr,start,end);
            System.out.println("Pivotal Point "+pivotalPoint+" and data "+arr[pivotalPoint]);
            sort(arr,start,pivotalPoint-1);
            sort(arr,pivotalPoint+1,end);
        }
    }
    public static void main(String[] args) {
        int[] arr = {89,12,45,78,112,90,34};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
