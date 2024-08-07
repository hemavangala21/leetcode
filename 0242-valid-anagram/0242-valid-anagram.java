class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()){
        return false;
        }

        int [] alph_arr= new int [26];
        for(int i=0;i<s.length();i++){
            alph_arr[s.charAt(i) - 'a']++;
            alph_arr[t.charAt(i) - 'a']--;
        }
        for(int i=0;i<alph_arr.length;i++){
            if(alph_arr[i]!=0){
                return false;
            }
        }
        return true;
    }
}