package internship.org.daythree;

public class JumpStairs {
    public static int dp(int stairs){
        if (stairs <= 0) {return 0;} 
        else if (stairs == 1) {return 1;} 
        else if (stairs == 2) {return 2;}
        int[] dp = new int[stairs + 1];
        dp[1] = 1;dp[2] = 2;
        for (int i = 3; i <= stairs; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[stairs];

    }
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
        // System.out.println(dc(7));
        System.out.println(dp(4));
    }
}
