class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        Map<Character, Integer> seen = new HashMap<>();
        int left = 0;
        int maxLength = 0;

        for(int right = 0; right < s.length(); right++){
            char current = s.charAt(right);

            if(seen.containsKey(current)){
                left = Math.max(left, seen.get(current)+1);
            }
            seen.put(current, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
