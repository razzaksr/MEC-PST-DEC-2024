package internship.org.daythree;

import java.util.Arrays;
import java.util.Scanner;

public class CoinChange {
    public static int dynamicProgramming(int[] arr,int userAmount){
        int[] poss=new int[userAmount+1];
        //System.out.println(poss.length);
        Arrays.fill(poss,userAmount+1);
        // initial solution
        //System.out.println(Arrays.toString(poss));
        poss[0]=0;
        for(int each:arr){
            // each is 500
            //System.out.println(each);
            int current;
            for(current=each;current<=userAmount;current++){
                // 500
                poss[current]=Math.min(poss[current],poss[current-each]+1);
                //System.out.println(poss[current]+" will occupy "+Math.min(poss[current],poss[current-each]+1));
                //System.out.println(poss[current]+" @ "+current);
            }
            //System.out.println(each+" end of iteration "+poss[poss.length-1]);
        }
        //System.out.println(Arrays.toString(poss));
        return (poss[userAmount]<=userAmount)?poss[userAmount]:-1;
    }
    // O(2n)
    public static int divideNConquer(int[] arr, int size, int user){
        if(user==0)
            return 0;
        if(user<0)
            return Integer.MAX_VALUE;
        int result = Integer.MAX_VALUE;
        for(int index=0;index<size;index++){
            int subResult = divideNConquer(arr, size, user-arr[index]);
            if(subResult!=Integer.MAX_VALUE)
                result = Math.min(result, 1 + subResult);
        }
        return result;
    }
    // O(n)
    public static int greedy(int[] arr, int user){
        int denomCount = 0;
        Arrays.sort(arr);
        int index = arr.length-1;
        while(user>0&&index>=0){
            if(user>=arr[index]){
                System.out.print(arr[index]+" ");
                user-=arr[index];
                denomCount++;
            }
            else{
                index--;
            }
        }
        return user==0?denomCount:-1;
    }
    public static void main(String[] args) {
        int[] denominations = {500,100,200};
        int userWish = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell us required cash ");
        userWish = scanner.nextInt();
        // int counts = greedy(denominations, userWish);
        // int counts = divideNConquer(denominations, denominations.length ,userWish);
        int counts = dynamicProgramming(denominations, userWish);
        if(counts!=Integer.MAX_VALUE)
            System.out.println("Count of notes "+counts);
        else
            System.out.println("Not possible");
        scanner.close();
    }
}
