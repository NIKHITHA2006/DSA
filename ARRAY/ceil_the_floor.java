// User function Template for Java

class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        int floor=-1;
        int ceil=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=x)
            {
                if(floor==-1||arr[i]>floor)
                {
                    floor=arr[i];
                }
            }
            if(arr[i]>=x)
            {
                if(ceil==-1||arr[i]<ceil)
                {
                    ceil =arr[i];
                }
            }
        }
        
        return new int[]{floor,ceil};
    }
}