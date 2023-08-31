class Solution {
    public boolean isPalindrome(int x) {
       if(x<0){
           return false;

       }
        int reversed=0;
        int num=x;
        while(x>0){
            reversed=reversed*10+x%10;
            x=x/10;
        }
        if(reversed==num){
            return true;
        }
       
        return false;
    
    }
}