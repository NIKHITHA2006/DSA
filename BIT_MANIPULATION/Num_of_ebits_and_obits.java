class Solution {
    public int[] evenOddBit(int n) {
       int e=0;
       int o=0;
       int in=0;
       while(n>0)
       {
         int b=n&1;
         if(b==1)
         {
            if(in%2==0)
            {
                e++;
            }
            else
            {
                o++;
            }
         }
         in++;
         n>>=1;
       } 
       return new int[]{e,o};
    }
}