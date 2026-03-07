class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n=nums.length;
        int[] ans=new int[n-k+1];
        for(int i=0;i<=n-k;i++)
        {
            int[] freq=new int[51];
            for(int j=i;j<i+k;j++)
            {
                freq[nums[j]]++;
            }
            List<Integer> l=new ArrayList<>();
            for(int v=1;v<=50;v++)
            {
                if(freq[v]>0)
                {
                    l.add(v);
                }
            }
            int sum=0;
            Collections.sort(l,(a,b)->{
                if(freq[a]==freq[b])
                {
                    return b-a;
                }
                return freq[b]-freq[a];
            });
            for(int g=0;g<Math.min(x,l.size());g++)
            {
              int a=l.get(g);
              sum +=a*freq[a];

            }
            ans[i]=sum;
        }
        return ans;
    }
}
