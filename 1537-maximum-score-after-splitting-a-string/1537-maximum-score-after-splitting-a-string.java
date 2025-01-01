class Solution {
    public int maxScore(String s) {
        int totalones = 0;
        int onescnt = 0;
        int zerocnt = 0;
        int bestScore = Integer.MIN_VALUE;

        for(char ch: s.toCharArray()){
            if(ch == '1'){
                totalones++;
            }
        }
        for(int i = 0;i<s.length()-1;i++){
            if(s.charAt(i)=='0'){
                zerocnt++;
            }
            else{
                onescnt++;
            }
            int currscore = zerocnt +(totalones-onescnt);
            bestScore = Math.max(bestScore, currscore);
        }
        return bestScore;
    }
}