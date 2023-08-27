class Solution {
    public boolean wordPattern(String pattern, String s) {
        String [] words= s.split(" ");
        if(words.length!=pattern.length())
        return false;
        HashMap<Character,String> map= new HashMap<>();
        for(int i=0;i<words.length;i++){
            char c= pattern.charAt(i);
            String word= words[i];
            if(!map.containsKey(c)){
                if(map.containsValue(word)) return false;
                map.put(c,word);
            }
            else if(!map.get(c).equals(word)) return false;
        }
        return true;
    }
}