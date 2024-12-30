package internship.org.daysix;

public class FindSingleInMany {
    public static int findSingle(int[] arr){
        int unique = 0; 
        int dups = 0; 
        for (int num : arr) { 
            //System.out.println(unique+" "+dups+" Before "+num);
            unique = (unique ^ num) & ~dups; 
            dups = (dups ^ num) & ~unique; 
            System.out.println(unique+" "+dups+" After "+num);
        } 
        return unique;
    }
    public static void main(String[] args) {
        // int[] arr = {2,2,3,2};
        int[] arr = {0,1,0,1,0,1,99};
        System.out.println(findSingle(arr));
    }
}
