package internship.org.dayseven;

public class XintoO {
    public static int minimumMoves(String pattern){
    int count=0;
    int index=0;
    //O(n)
    while(index<pattern.length()){
        if(pattern.charAt(index)=='X'){
            count++;
            index+=3;
        }
        else{
            index++;
        }
    }
    return count;
}

public static void main(String [] args){
    String s1="XXX";
    System.out.println("Input:"+s1);
    System.out.println("Output:"+minimumMoves(s1));

    String s2="XXOX";
    System.out.println("Input:"+s2);
    System.out.println("Output:"+minimumMoves(s2));

    String s3="OOO";
    System.out.println("Input:"+s3);
    System.out.println("output:"+minimumMoves(s3));
    
}
} 