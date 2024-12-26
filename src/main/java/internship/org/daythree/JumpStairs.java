package internship.org.daythree;

public class JumpStairs {
    public static int dc(int stairs){
        if(stairs<=0)
            return 0;
        else if(stairs==1)
            return 1;
        else if(stairs==2)
            return 2;
        else
            return dc(stairs-1) + dc(stairs-2);
    }
    public static int greedy(int stairs){
        int count = 0;
        while(stairs>0){
            if(stairs>=2){
                count+=2;stairs-=2;
            }
            else{
                count++;stairs--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        // since it fails large number of possibilities
        // System.out.println(greedy(5));
        // System.out.println(dc(5));
        // System.out.println(dc(6));
        System.out.println(dc(7));
    }
}
