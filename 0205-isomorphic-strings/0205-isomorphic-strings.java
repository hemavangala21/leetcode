class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map= new HashMap<>();

        for(int i=0;i<s.length();i++){
            char a= s.charAt(i);     // a=original char
            char b= t.charAt(i);     // b= replaced char

            if(!map.containsKey(a)){
                if(!map.containsValue(b)){
                    map.put(a,b);
                }
                else
                return false;
            }
            else{
                char mappedChar= map.get(a);
                if(mappedChar!=b){
                    return false;
                }
            }           
        }
        return true;
    }
}