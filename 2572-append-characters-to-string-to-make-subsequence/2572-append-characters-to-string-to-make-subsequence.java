class Solution {
    public int appendCharacters(String s, String t) {
        int i=0;
        int j=0;

        int lens=s.length();
        int lent=t.length();

        while(i<lens && j<lent){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }else{
                i++;
            }
        }
        return lent-j;
    }
}