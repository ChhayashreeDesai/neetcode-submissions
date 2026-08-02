class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int match = 0;
        int[] freq = new int[26];

        for(char c: s1.toCharArray()){
            freq[c - 'a']++;
        }
        
        for(int i = 0; i< s1.length(); i++){
            char c = s2.charAt(i);
            freq[c - 'a']--;

            if(freq[c-'a'] >= 0){
                match++;
            }
        }

        if(match == s1.length()){
            return true;
        }

        for(int i = s1.length(); i < s2.length(); i++){
            char add = s2.charAt(i);
            char remove = s2.charAt(i - s1.length());

            freq[add - 'a']--;
            if(freq[add - 'a'] >= 0){
                match++;
            }

            freq[remove - 'a']++;
            if(freq[remove - 'a'] > 0){
                match--;
            }

            if(match == s1.length()){
                return true;
            }
        }
        return false;
    }
}
