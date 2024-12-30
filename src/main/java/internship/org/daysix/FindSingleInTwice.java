package internship.org.daysix;

public class FindSingleInTwice {
    public static int findSingle(int[] arr, int start,int end){
        if(start==end){
            return arr[start];
        }
        int mid = start+(end-start)/2;
        if(mid%2!=0)
            mid--;
        if(arr[mid]==arr[mid+1])
            return findSingle(arr, mid+2, end);
        else
            return findSingle(arr, start, mid);
    }
    public static void main(String[] args) {
        // int[] numbers =  {1,1,2,3,3,4,4,8,8};
        // int[] numbers =  {3,3,7,7,10,11,11};
        int[] numbers =  {1,1,2,3,3,4,4,5,8,8};
        System.out.println(findSingle(numbers, 0, numbers.length-1));
    }
}
