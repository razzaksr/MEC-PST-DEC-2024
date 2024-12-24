package internship.org.dayone;

/*
 * InversionCount is no of pairs in array where left > right
 * Example:
 * 1, 9, 6, 4, 5
 * (9, 6), (9, 4), (9, 5), (6, 4), (6, 5)
 * Count = 5
 * 
 * 9,4,2,13,10,6,12
 * (9,4),(9,2),(9,6),(4,2),(13,10),(13,6),(13,12),(10,6)
 * count = 8
 */

public class InversionCount {
    // O(n2)
    public static int inversionCount(int[] arr){
        int inversions=0;
        for(int current=0;current<arr.length-1;current++){
            for(int adjucent=current+1;adjucent<arr.length;adjucent++){
                if(arr[current]>arr[adjucent]){inversions++;}
            }
        }
        return inversions;
    }

    // O(nlogn)
    public static int mergingSplitted(int[] original, int[] temporary, int start, int middle, int end){
        int inversions = 0;
        int westIndex = start, eastIndex = middle + 1, current = start;
        while(westIndex<=middle&&eastIndex<=end){
            if(original[westIndex]<=original[eastIndex]){
                temporary[current++] = original[westIndex++];
            }
            else{
                temporary[current++] = original[eastIndex++];
                inversions += (middle-eastIndex+1);
            }
        }
        return inversions;
    }

    public static void main(String[] args) {
        // int[] arr = {45,91,10,67,21,6,11};
        // int[] arr = {1, 9, 6, 4, 5};
        int[] arr = {9,4,2,13,10,6,12};
        //System.out.println(inversionCount(arr));
    }

}
