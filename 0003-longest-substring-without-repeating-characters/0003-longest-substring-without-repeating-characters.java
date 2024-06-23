class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0;
        int longest = 0;

        HashSet<Character> hash = new HashSet<>();
        for(int right = 0; right < n; right++){
            while(hash.contains(s.charAt(right))){
                hash.remove(s.charAt(left));
                left++;
            }
            hash.add(s.charAt(right));
            longest = Math.max(longest, right-left+1);
        }
        return longest;
    }
}