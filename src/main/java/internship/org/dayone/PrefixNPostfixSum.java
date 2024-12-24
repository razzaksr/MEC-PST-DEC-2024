package internship.org.dayone;

public class PrefixNPostfixSum {
    public static void prefixSum(int[] array){
        int size = array.length;
        int currentSum=array[size-1];
        
        // int[] preSum = new int[size];

        // preSum[size-1]=array[size-1];

        System.out.print(currentSum+", ");
        // iterate and finding sum
        for(int index=size-2;index>=0;index--){
            // preSum[index]=array[index]+preSum[index+1];
            currentSum+=array[index];
            System.out.print(currentSum+", ");
        }
        System.out.println();

        //System.out.println(Arrays.toString(preSum));
    }
    public static void postfixSum(int[] array){
        int size = array.length;
        int currentSum=array[0];
        
        // int[] preSum = new int[size];

        // preSum[0]=array[0];

        System.out.print(currentSum+", ");
        // iterate and finding sum
        for(int index=1;index<size;index++){
            // preSum[index]=array[index]+preSum[index+1];
            currentSum+=array[index];
            System.out.print(currentSum+", ");
        }
        System.out.println();

        //System.out.println(Arrays.toString(preSum));
    }
    public static void main(String[] args) {
        int[] balance={23,12,98,45,18,45,12,98};
        int size = balance.length;

        // PrefixSum
        prefixSum(balance);
        postfixSum(balance);
    }
}
