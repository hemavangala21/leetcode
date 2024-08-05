class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder string = new StringBuilder();
        int opencount = 0;
        for(char c: s.toCharArray()){
            if(c == '('){
                if(opencount>0){
                    string.append(c);
                }
                opencount++;
            }else{
                opencount--;
                if(opencount > 0){
                    string.append(c);
                }
            }
        }
        return string.toString();
    }
}