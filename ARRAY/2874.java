
class Solution {
    public long maximumTripletValue(int[] nums) {
        int l=nums.length;
        long ans=0;
        int[] maxright=new int[l];
        maxright[l-1]=nums[l-1];
        for(int i=l-2;i>=0;i--)
        {
            maxright[i]=Math.max(nums[i],maxright[i+1]);
        }
        int maxleft=nums[0];
        for(int j=1;j<l-1;j++)
        {
            long v =(long)(maxleft-nums[j])*maxright[j+1];
            ans=Math.max(ans,v);
            maxleft=Math.max(nums[j],maxleft);

        }
return ans;
    }
}
