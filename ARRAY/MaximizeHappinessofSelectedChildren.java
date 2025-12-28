class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long h=0;
        int d=0;
        for(int i=happiness.length-1;i>=0&&k>0;i--)
        {
            happiness[i]-=d;

            if(happiness[i]>0)
            {
                h+=happiness[i];
            }
            d++;
            k--;
        }
        return h;
    }
}