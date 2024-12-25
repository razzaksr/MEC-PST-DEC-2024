package internship.org.daytwo;

import java.util.Arrays;

public class SortMerge {
    public static void mergeAndSort(int[] arr, int start, int mid, int end){
        int lengthWest = mid - start+1;
        int lengthEast = end - mid;
        int west, east, index;
        //System.out.println(lengthWest+" "+lengthEast);
        int[] westArray = new int[lengthWest];
        int[] eastArray = new int[lengthEast];

        for(west = 0;west < lengthWest;west++){
            westArray[west] = arr[start+west];
        }

        for(east=0;east<lengthEast;east++){
            eastArray[east]=arr[mid+1+east];
        }

        // System.out.println("West Array "+Arrays.toString(westArray));
        // System.out.println("East Array "+Arrays.toString(eastArray));

        east=0; west=0; index = start;

        while(west<lengthWest&&east<lengthEast){
            if(westArray[west]>eastArray[east]){
                arr[index] = eastArray[east];
                east++;
            }
            else{
                arr[index]=westArray[west];
                west++;
            }
            index++;
        }

        while(west<lengthWest){
            arr[index]=westArray[west];
            west++;index++;
        }
        while(east<lengthEast){
            arr[index]=eastArray[east];
            east++;index++;
        }

        //System.out.println("After sort "+Arrays.toString(arr));
        
    }
    public static void divide(int[] arr, int start, int end){
        //System.out.println(Arrays.toString(Arrays.copyOfRange(arr, start, end+1)));
        if(start<end){
            int mid = start+(end-start)/2;
            divide(arr, start, mid);
            divide(arr, mid+1, end);
            mergeAndSort(arr, start, mid, end);
        }
    }
    public static void main(String[] args) {
        int[] myArray = {89,12,45,78,112,90,34};
        divide(myArray, 0, myArray.length-1);
        System.out.println(Arrays.toString(myArray));
    }
}
