class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=nums.length;
        int sum;
        double max = -Double.MAX_VALUE;

        for(int i=0;i<=l-k;i++)
        {
            sum=0;
            for(int j=i;j<k+i;j++)
            {
                 sum+=nums[j];

            }
            double avg=(double)sum/k;
            max=Math.max(avg,max);
            
        }

     return max;

        
    }
}