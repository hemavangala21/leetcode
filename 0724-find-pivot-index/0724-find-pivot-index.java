class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum=0;
        int leftsum=0;
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(i!=0) leftsum+=nums[i-1];
            if(totalsum-leftsum-nums[i]==leftsum){
                return i;
            }
        }
        return -1;
    }
}