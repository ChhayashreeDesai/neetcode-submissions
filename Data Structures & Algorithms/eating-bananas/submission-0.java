class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for(int pile : piles){
            right = Math.max(right, pile);
        }
        while(left < right){
            long totalhrs = 0;
            int mid = left + (right - left)/2;
            for(int pile: piles){
                totalhrs += (pile + mid -1)/mid;
            }
            if(totalhrs <= h){
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }
}
