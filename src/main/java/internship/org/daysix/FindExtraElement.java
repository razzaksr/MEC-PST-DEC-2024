package internship.org.daysix;

public class FindExtraElement {
    public static void main(String[] args) {
        int[] source = {3,5};
        int[] compare = {3};
        // int[] source = {2,4,6,8,9,10,12};
        // int[] compare = {2,4,6,8,10,12};
        // int[] source = {3,5,7,8,11,13};
        // int[] compare = {3,5,7,11,13};
        for(int index=0;index<source.length;index++){
            if(index>=compare.length)
                System.out.println(source[index]+" @ "+index);
            else{
                if(source[index]!=compare[index]){
                    System.out.println(source[index]+" @ "+index);
                    return;
                }
            }
        }
    }
}
