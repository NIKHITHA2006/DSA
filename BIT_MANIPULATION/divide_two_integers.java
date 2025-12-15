class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor==-1)
        {
            return Integer.MAX_VALUE;

        }
        boolean n=(dividend<0)^(divisor<0);
        long dvd=Math.abs((long)dividend);
        long dvs=Math.abs((long)divisor);
        long q=0;
        while(dvd>=dvs)
        {
            long temp=dvs;
            long mul=1;
            while(dvd>=(temp<<1))
            {
                temp<<=1;
                mul<<=1;
            }
            dvd-=temp;
            q+=mul;

        }
        return n?(int)-q:(int)q;
        
    }
}