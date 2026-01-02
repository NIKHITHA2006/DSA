class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> n= new HashSet<>();
        for(int num:nums)
        {
            if(!n.add(num))
            {
                return num;
            }
        }
        return -1;
    }
}