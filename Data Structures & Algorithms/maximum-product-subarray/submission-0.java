class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 0) return 0;
        int min = nums[0];
        int maxi = nums[0];
        int gmax = nums[0];
        for(int i = 1; i < nums.length ; i++){
            int num = nums[i];
            int mintemp = min;
            int maxtemp = maxi;
            maxi = Math.max(num, Math.max(mintemp*num, maxtemp*num));
            min = Math.min(num, Math.min(mintemp*num, maxtemp*num));
            gmax = Math.max(gmax, maxi);
        }
        return gmax;
    }
}
