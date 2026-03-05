
class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;

 
        if (k == 1) return nums.clone();

        int[] result = new int[n - k + 1];
        int count = 1;

        for (int i = 1; i < n; i++) {

        
            if (nums[i] == nums[i - 1] + 1) {
                count++;
            } else {
                count = 1;
            }

            if (i >= k - 1) {
                if (count >= k) {
                    result[i - k + 1] = nums[i]; 
                } else {
                    result[i - k + 1] = -1;
                }
            }
        }
        return result;
    }
}
