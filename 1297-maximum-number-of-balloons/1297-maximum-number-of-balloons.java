class Solution {
    public int maxNumberOfBalloons(String text) {
        int a=0,b=0,l=0,o=0,n=0,i=0;
        for(char c: text.toCharArray()){
            switch(c){
                case 'a'-> a++;
                case 'b'-> b++;
                case 'l'-> l++;
                case 'o'-> o++;
                case 'n'-> n++;
            }
            if(a>=1 && b>=1 && l>=2 && o>=2 && n>=1){
                i++;
                a-=1;b-=1;n-=1;l-=2;o-=2;
            }
        }
        return i;
    }
} 