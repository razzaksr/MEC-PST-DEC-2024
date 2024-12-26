package internship.org.daythree;

public class FindMissingMin {
    // O(logn)
    public static int missingMinDC(int[] arr, int start,int end){
        if(start>end)
            return start;
        else{
            int midIndex = start+(end-start)/2;
            if(midIndex<arr[midIndex])
                return missingMinDC(arr, start, midIndex-1);
            else
                return missingMinDC(arr, midIndex+1, end);
        }
    }
    // O(n)
    public static int missingMinGreedy(int[] arr){
        int size = arr.length;
        for(int index=0;index<size;index++){
            if(arr[index]!=index)
                return index;
        }
        return size;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,3,4,5,6,7};
        // int[] arr = {0,1,2,3,4,5};
        // int[] arr = {0,2,3,5,6,7,8};
        // int[] arr = {1,2,3,4,6,7,8,9};
        // int missed = missingMinGreedy(arr);
        int missed = missingMinDC(arr,0,arr.length-1);
        System.out.println(missed);
    }
}
