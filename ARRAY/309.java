class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0)
        {
            return 0;
        }
        int hold=-prices[0];
        int s=0;
        int r=0;
        for(int i=0;i<prices.length;i++)
        {
            int phold=hold;
            int ps=s;
            int pr=r;
            hold=Math.max(phold,pr-prices[i]);
            s=phold+prices[i];
            r=Math.max(pr,ps);
        }
        return Math.max(r,s);
    }
}
