class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> hash = new HashSet<>();
        int count =0;

        for(int i=0;i<s.length();i++){
            if(hash.contains(s.charAt(i))){
                hash.remove(s.charAt(i));
                count +=2;
            }
            else{
                hash.add(s.charAt(i));
            }
        }
        if(!hash.isEmpty()){
            count+=1;
        }
        return count;
    }
}