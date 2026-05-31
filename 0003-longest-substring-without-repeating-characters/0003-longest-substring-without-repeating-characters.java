class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int left = 0;
        for(int right = 0; right < n; right++) {
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c,0)+1);
            while(map.get(c) > 1) {
             char leftchar = s.charAt(left);
             map.put(leftchar, map.getOrDefault(leftchar,0)-1);
             left++;
            }
            maxLen = Math.max(maxLen , right-left+1);
        }
        return maxLen;
    }
}