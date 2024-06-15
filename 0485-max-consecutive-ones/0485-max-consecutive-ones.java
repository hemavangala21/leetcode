class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int up_count = 0;
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                 count = 0;
            }
            if(nums[i]==1 ){
                count++;
                if(up_count< count){
                    up_count = count;
                }
            }
        }
        return up_count;
    }
}