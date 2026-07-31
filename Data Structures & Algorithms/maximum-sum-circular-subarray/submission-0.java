class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        
        int maxEndingHere = nums[0];
        int maxSoFar = nums[0];
        
        int minEndingHere = nums[0];
        int minSoFar = nums[0];
        
        int totalSum = nums[0];
        
        for (int i = 1; i < n; i++) {
            int num = nums[i];
            totalSum += num;
            
            maxEndingHere = Math.max(num, maxEndingHere + num);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
            
            minEndingHere = Math.min(num, minEndingHere + num);
            minSoFar = Math.min(minSoFar, minEndingHere);
        }
        
        if (maxSoFar < 0) {
            return maxSoFar;
        }
        
        int circularMax = totalSum - minSoFar;
        
        return Math.max(maxSoFar, circularMax);
    }
}