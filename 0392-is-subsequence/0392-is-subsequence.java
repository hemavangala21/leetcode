/*class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0){
            return true;
        }
        int i=0;
        int j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(i)){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        if(i==s.length()) return true;
        return false;
    }
    
}*/

class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)
        {
            return true;
        }
        int p = 0;
        for(int i=0;i<t.length();i++)
        {
            if(p<s.length()&&t.charAt(i)==s.charAt(p))
            {
                p++;
            }
        }
        if(p == s.length()) return true;
        return false;
    }
}
