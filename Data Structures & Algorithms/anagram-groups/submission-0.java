class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> sorted = new HashMap<>();
        for(String str : strs){
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String s = new String(c);
            if(!sorted.containsKey(s)){
                sorted.put(s, new ArrayList<>());
            }
            sorted.get(s).add(str);
        }
        return new ArrayList<>(sorted.values());
    }
}
