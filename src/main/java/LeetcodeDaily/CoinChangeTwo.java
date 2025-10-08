package LeetcodeDaily;


public class CoinChangeTwo {
    static int solution(int amount, int[] coins){
        int[] dp=new int[amount+1];
        dp[0]=1;
        for(int c:coins){
            for(int a=c;a<=amount;a++){
                dp[a]+=dp[a-c];
            }
        }
        return dp[amount];
    }
    public static void main(String[] args) {
        System.out.println(solution(5,new int[]{1,2,5}));
    }
}
