class Solution {
    public int minOperations(int[] nums, int k) {
        long sum = 0L;
        for (int v : nums) 
        {
            sum += v;
        }
        int rem = (int)(sum % k);
        if (rem < 0) rem += k; 
        return rem;
    }
}
