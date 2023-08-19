class Solution {
    public int lengthOfLastWord(String s) {
       // System.out.println(s.length());
        String str= s.trim();
        int count=0;
        for(int i = str.length()-1;i>=0;i--){
            //int count=0;

            if(str.charAt(i)!=' '){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}