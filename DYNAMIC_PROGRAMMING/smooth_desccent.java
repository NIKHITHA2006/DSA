class Solution {
    public long getDescentPeriods(int[] prices) {
        int l=prices.length;
        long dp[]=new long[l];
        dp[0]=1;
        long c=1;
        
        for(int i=1;i<l;i++)
        {
            if((prices[i-1]-prices[i])==1)
            {
                dp[i]=dp[i-1]+1;
            }
            else
            {
                dp[i]=1;
            }
            c+=dp[i];
        }
        
return c;

    }
}