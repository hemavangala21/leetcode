class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> mapping= new HashMap<>();

        for(int i=0;i<s.length();i++){
            char a= s.charAt(i);     // a=original char
            char b= t.charAt(i);     // b= replaced char

            if(!mapping.containsKey(a)){
                if(!mapping.containsValue(b)){
                    mapping.put(a,b);
                }
                else
                return false;
            }
            else{
                char mappedChar= mapping.get(a);
                if(mappedChar!=b){
                    return false;
                }
            }           
        }
        return true;
    }
}