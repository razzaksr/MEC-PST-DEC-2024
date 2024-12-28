package internship.org.dayfour;

import java.util.Arrays;

public class SecurityCheck {
    public static void bharathi(int[] risks){
        int size=risks.length;
        int countzero=0;
        int countone=0;
        int counttwo=0;

        for(int i=0;i<size;i++){
            if (risks[i]==0) 
                countzero++;
            else if (risks[i]==1) 
                countone++;
            else
                counttwo++;
        }

        for(int j=0;j<size;j++){
            if (countzero>0) {
                risks[j]=0;
                countzero--;
            }
            else if(countone>0){
                risks[j]=1;
                countone--;
            }
            else{
                risks[j]=2;
                counttwo--;
            }
        }
    }

    public static void sortRisks(int[] risks) {
        int low = 0, mid = 0, high = risks.length - 1;
        while (mid <= high) {
            if (risks[mid] == 0) {
                // Swap risks[low] and risks[mid], then increment both
                int temp = risks[low];
                risks[low] = risks[mid];
                risks[mid] = temp;
                low++;
                mid++;
            } else if (risks[mid] == 1) {
                // Just move mid forward
                mid++;
            } else { // risks[mid] == 2
                // Swap risks[mid] and risks[high], then decrement high
                int temp = risks[mid];
                risks[mid] = risks[high];
                risks[high] = temp;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int[] risks1 = {1, 0, 2, 2, 1, 1, 2, 2, 1, 0, 2, 1, 0};
        int[] risks2 = {1, 2, 2, 1, 0, 0};
        // sortRisks(risks1);
        // sortRisks(risks2);
        bharathi(risks1);
        bharathi(risks2);
        System.out.println(Arrays.toString(risks1)); // Output: [0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2]
        System.out.println(Arrays.toString(risks2)); // Output: [0, 0, 1, 1, 2, 2]
        bharathi(risks1);
    }
}
