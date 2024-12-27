// class Solution {
//     public int maxScoreSightseeingPair(int[] values) {
//         int max = Integer.MIN_VALUE;
//         for(int i = 0;i<values.length-1;i++){
//             for(int j = 1;j<values.length;j++){
//                 int res = values[i] + values[j] + i - j;
//                 if(res>max){
//                     max = res;
//                 }
//             }
//         }
//         return max;
//     }
// }
class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int maxScore = Integer.MIN_VALUE;
        int maxPrev = values[0]; 
        
        for (int j = 1; j < values.length; j++) {
            maxScore = Math.max(maxScore, maxPrev + values[j] - j);
            maxPrev = Math.max(maxPrev, values[j] + j);
        }
        
        return maxScore;
    }
}
