class Solution {
    public int numOfWays(int n) {
        long MOD= 1000000007;
        long abc=6;
        long aba=6;
        for(int i=2;i<=n;i++)
        {
            long nabc=(2*abc+2*aba)%MOD;
            long naba=(2*abc+3*aba)%MOD;
            abc=nabc;
            aba=naba;
        }
        return (int)((aba+abc)%MOD);
    }
}
// time complexity: O(n)
// space complexity: O(1)