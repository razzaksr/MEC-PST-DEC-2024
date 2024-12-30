package internship.org.daysix;

import java.util.Arrays;

// import java.util.ArrayList;
// import java.util.List;

public class FindMinPrime {
    public static void findMinPrime(int[] input1,int[] input2, int[] result){
        for(int index=0;index<input1.length;index++){
            int start = input1[index];
            int end = input2[index];
            //System.out.println("Primes found between "+start+" and "+end+" are ");
            while(start<=end){
                if(start==2||start==3||start==5||start==7||start%2!=0&&start%3!=0&&start%5!=0&&start%7!=0)
                //System.out.print(start+",");
                if((start+input1[index])%input2[index]==0){
                    result[index]=start;
                    break;
                }
                start++;
            }
            if(result[index]==0)
                result[index]=-1;
            //System.out.println();
        }
        System.out.println(Arrays.toString(result));
    }
    public static void main(String[] args) {
        int[] arr1 = {3, 5, 7};
        int[] arr2 = {10, 15, 20};
        // int[] arr1 = {4, 6, 8};
        // int[] arr2 = {5, 10, 15};
        int[] arr3 = new int[3];
        findMinPrime(arr1, arr2, arr3);
    }
}
