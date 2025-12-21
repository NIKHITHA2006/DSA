class Solution {
    public int minDeletionSize(String[] strs) {
        int co=0;
        int col=strs[0].length();
        int row=strs.length;
        for(int c=0;c<col;c++)
        {
            for(int r=1;r<row;r++)
            {
                if(strs[r].charAt(c)<strs[r-1].charAt(c))
                {
                    co++;
                    break;
                }
            }
        }
        return co;
    }
}