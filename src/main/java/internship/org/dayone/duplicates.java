package internship.org.dayone;

import java.util.Arrays;

public class duplicates {
    public static void linear(int[] balance){
        int count,totalDuplicates=0;
        for(int select=0;select<balance.length;select++){
            count=0;
            for(int checks=select+1;checks<balance.length;checks++){
                if(balance[select]==balance[checks]){
                    count++;
                }
            }
            if(count>=1){
                totalDuplicates++;
            }
        }
        System.out.println("totalDuplicates are "+totalDuplicates);
    }
    public static void optimize(int[] balance){
        Arrays.sort(balance);
        int count,totalDuplicates=0;
        for(int select=0;select<balance.length;select++){
            count=0;
            while(select<balance.length-1&&balance[select]==balance[select+1]){
                count++;
                select++;
            }
            if(count>=1){
                totalDuplicates++;
            }
        }
        System.out.println("totalDuplicates are "+totalDuplicates);
    }
    public static void main(String[] args) {
        int[] balance={23,12,98,45,18,45,12,98};
        // greedy>> linear
        // linear(balance);// O(n2)
        optimize(balance);// (nlogn)
    }
}
