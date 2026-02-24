class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int l=nums1.length;
        int l2=nums2.length;
        int c=0;
        int[] temp=new int[Math.min(l,l2)];

        for(int i=0;i<l;i++)
        {
             if (i > 0 && nums1[i] == nums1[i - 1]) continue;
            for(int j=0;j<l2;j++)
            {
                if(nums1[i]==nums2[j]&&nums1[i]!=-1&&nums2[j]!=-1)
                {
                    temp[c++]=nums1[i];
                    
                    nums2[j]=-1;
                    break;
                }
            }

        }
        int[] res=new int[c];
        for(int i=0;i<c;i++)
        {
            res[i]=temp[i];
        }
        return res;
    }
}